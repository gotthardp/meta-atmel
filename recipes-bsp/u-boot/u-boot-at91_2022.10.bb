require u-boot-atmel.inc
require u-boot-envs-atmel.inc

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=22;md5=b5410c33378a67de244a5877f9ff9a27"

SRCREV = "e48a975412e656e4fd899fed59b2ce3a20f02df8"

PV = "v2022.01-at91+git${SRCPV}"

DEPENDS += "bison-native flex-native"

COMPATIBLE_MACHINE = '(sama5d3xek|sama5d3-xplained|sama5d3-xplained-sd|at91sam9x5ek|at91sam9rlek|at91sam9m10g45ek|sama5d4ek|sama5d4-xplained|sama5d4-xplained-sd|sama5d2-xplained|sama5d2-xplained-sd|sama5d2-xplained-emmc|sama5d2-ptc-ek|sama5d2-ptc-ek-sd|sama5d27-som1-ek|sama5d27-som1-ek-sd|sama5d27-som1-ek-optee-sd|sama5d2-icp-sd|sam9x60ek|sam9x60ek-sd|sama5d27-wlsom1-ek-sd|sama7g5ek|sam9x60-curiosity|sam9x60-curiosity-sd)'

UBRANCH = "u-boot-2022.01-at91"

SRC_URI = "git://github.com/linux4sam/u-boot-at91.git;protocol=https;branch=${UBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
