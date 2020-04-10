FILESEXTRAPATHS_prepend := "${THISDIR}/glibc:"

SRC_URI_append = "\
           file://argp.patch \
"
