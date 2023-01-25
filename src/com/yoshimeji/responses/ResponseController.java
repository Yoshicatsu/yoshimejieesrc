package com.yoshimeji.responses;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class ResponseController {
    private static NodeList nodeResponses;

    public ResponseController() {
        setup();
    }

    private static void setup()
    {
        String path = "./conf/responses.xml";
        File file = new File(path);
        if(file.exists()){
            try {
                Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(
                        new FileInputStream(file));

                if(Objects.isNull(doc)){
                    return;
                }

                nodeResponses = doc.getElementsByTagName("Prompt");
                String response = nodeResponses.item(0).getTextContent();
                System.out.println(response);
            } catch (SAXException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ParserConfigurationException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static String prompt(String input){
        String generic = "Huh?";
        for (int i = 0; i < nodeResponses.getLength(); i++) {
            Element promptElement = (Element) nodeResponses.item(i);
            String attribute = promptElement.getAttribute("Input");
            if (attribute.equalsIgnoreCase(input)) {
                String message = promptElement.getTextContent();
                return ("Shimeji answers: " + message);
            }
            if(attribute.equalsIgnoreCase("GenericAnswer")){
                generic = promptElement.getTextContent();
            }
        }

        return ("Shimeji answers: " + generic);
    }
}
