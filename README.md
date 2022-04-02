YoShimejiEE Source
========================

https://github.com/Yoshicatsu/yoshimejieesrc


This project is a fork of [Kilkakon's shimeji version](http://kilkakon.com/shimeji) and includes work from many others such as [LavenderSnek](https://github.com/LavenderSnek/ShimejiEE-cross-platform), which by extension also incorporates work by [nonowarn's shimeji4mac](https://github.com/nonowarn/shimeji4mac) and so on.

Go to the releases section for the latest release.

Installation
-------

If you are a developer looking to make changes to the code, look at the setup.txt file on how to start working on the code. It presumes you're using Intellij Community Edition, which is great and free, 
and the appropriate equivalent steps should be taken if you're planning on working with other IDEs.

If you are a user that just wants to have a cute mascot running around, download the project as zip, extract it and run 'yoshimeji.jar'. If everything is set properly, it should as simple as that.
Change the images on the img/Shimeji folder so that they're of the character you want, respecting naming conventions.
Or just create a new folder inside img folder that contains all your character's sprites, again remember to respect the file naming conventions.
This means you should be quite careful when renaming everything in general and the src, conf, img folders in particular.

Credits
-------

- Kilkakon
  - Current maintainer. Added sounds, affordances, and japanese conf compatibility.
  - [Homepage](http://kilkakon.com/shimeji)
  - [Shimeji discord](https://discord.gg/dcJGAn3)

- LavenderSnek
  - A Pillar of the Community on Kilkakon's discord. Made plenty of contributions such as adding a way to replace the current set of active imageSets without modifying valid imageSets that are already active.
  - Also the one who helped me get the project set up the right way, as I couldn't even contribute to anything before seeing as just looking at the source code isn't enough for correctly running shimeji. I would've taken many hours of frustrating trial and error until it was done right if not for his tips.
  - I'm also shamelessly copying much of his description and Licenses on GitHub because it's already well documented and I'm simply not good at this kind of stuff.
  - [GitHub page](https://github.com/LavenderSnek)

- nonowarn
  - Wrote the initial swing + jna mac implementation
  - [GitHub page](https://github.com/nonowarn/shimeji4mac)

- TigerHix
  - Added 64 bit support for windows
  - [GitHub page](https://github.com/TigerHix/shimeji-universal)

- The shimeji-ee Group
  - Added i18n
  - [Google Code repo](https://code.google.com/archive/p/shimeji-ee/source/default/commits)

- Group Finity (Original)
  - The original creator(s) of shimeji
  - [Homepage snapshot](https://web.archive.org/web/20140530231026/http://www.group-finity.com/Shimeji/)
  - [Vector page](https://www.vector.co.jp/soft/winnt/amuse/se476479.html )
