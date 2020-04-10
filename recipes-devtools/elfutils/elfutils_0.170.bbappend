FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "\
           file://libelf-msize.patch \
"
