SUMMARY = "Adds LED heartbeat signal for beaglebone"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/eldarht/beagleLED.git"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"

inherit cmake
EXTRA_OECMAKE = ""
