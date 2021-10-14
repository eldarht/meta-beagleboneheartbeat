SUMMARY = "Image for task 2 for YoctoProject"
inherit core-image
LICENSE = "MIT"
IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL +="beaglebone-heartbeat"