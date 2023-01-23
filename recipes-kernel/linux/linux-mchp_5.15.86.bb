require linux.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${P}:"
PV = "5.15+git${SRCPV}"

KBRANCH = "linux-5.15-mchp+sam9x7"
SRC_URI = "git://github.com/linux4sam/linux-at91.git;protocol=https;branch=${KBRANCH}"
SRC_URI:append:sam9x75 = " file://defconfig"
SRC_URI:append:sam9x60 = " file://defconfig"
SRC_URI:append:sama5 = " file://defconfig"
SRC_URI:append:sama5d27-som1-ek-optee-sd = " file://sama5-linux-optee.cfg \
                                             file://0001-dts-include-optee-dtsi.patch \
                                             "
SRCREV = "e3594a99780e464cab1917cd424008dae20d4831"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

# Add greengrass fragment for SAMA5D2 platforms
SRC_URI:append:sama5d2 = "\
    file://gg.cfg \
"
KERNEL_MODULE_AUTOLOAD:append:sama5d27-wlsom1-ek-sd = " wilc-sdio"

COMPATIBLE_MACHINE = "(sama5d2-xplained|sama5d2-xplained-sd|sama5d2-xplained-emmc|sama5d2-ptc-ek|sama5d2-ptc-ek-sd|sama5d27-som1-ek|sama5d27-som1-ek-sd|sama5d27-som1-ek-optee-sd|sama5d4-xplained|sama5d4-xplained-sd|sama5d4ek|sama5d3-xplained|sama5d3-xplained-sd|sama5d3xek|at91sam9x5ek|at91sam9m10g45ek|at91sam9rlek|sama5d2-icp-sd|sam9x60ek|sam9x60ek-sd|sama5d27-wlsom1-ek-sd|sama7g5ek|sam9x60-curiosity|sam9x60-curiosity-sd|sam9x75eb|sam9x75eb-sd)"
