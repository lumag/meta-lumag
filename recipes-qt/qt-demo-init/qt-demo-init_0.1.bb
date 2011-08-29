DESCRIPTION = "Init script for qtdemo"
LICENSE = "MIT"
SRC_URI = "file://qtdemo-init"
LIC_FILES_CHKSUM = "file://qtdemo-init;md5=e9b104bf17a845c6a984b9f2af04abeb"
PR = "r2"

S = "${WORKDIR}"

PACKAGE_ARCH = "all"

do_install() {
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/qtdemo-init ${D}${sysconfdir}/init.d/qtdemo
}

inherit update-rc.d

INITSCRIPT_NAME = "qtdemo"
INITSCRIPT_PARAMS = "start 99 5 2 . stop 19 0 1 6 ."
