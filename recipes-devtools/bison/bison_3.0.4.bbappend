FILESEXTRAPATHS_prepend := "${THISDIR}/bison:"

SRC_URI_append = " \
    file://gnulib.patch \
"
