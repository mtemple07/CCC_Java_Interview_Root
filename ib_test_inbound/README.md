# aisbillaround-inbound

This project produces the inbound data archive for AIS BillAround

## How DO I make a new version?

1. Clone this repo
1. Download the new `AIS_BillAround.txt` file from wherever you get it (currently, this process doesn't define that but it will shortly)
1. Move your new file into `src/main/ibdata/AIS_BillAround.txt`, overwriting the current one.
1. Obtain a SHA-512 of that file.  `certUtil -hashfile src/main/ibdata/AIS_BillAround.txt SHA512` on Windows or `shasum -a 512 src/main/ibdata/AIS_BillAround.txt` should do the trick.
1. Edit the `pom.xml` file and change the value of the `<sha512>` tag (just search for it, there's only one) to the value you just generated. This will be a very long hexadecimal number and should not include the filename or any other data (like the filename).
1. Perform a `mvn clean verify` .  This will ensure that everything is as we expect.
1. Commit and push your changes to the remote repo.



