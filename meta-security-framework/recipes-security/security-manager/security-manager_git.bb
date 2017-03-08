require security-manager.inc

PV = "1.0.2+git${SRCPV}"
SRCREV = "860305a595d681d650024ad07b3b0977e1fcb0a6"
SRC_URI += "git://github.com/Samsung/security-manager.git"
S = "${WORKDIR}/git"

SRC_URI += " \
file://systemd-stop-using-compat-libs.patch \
file://security-manager-policy-reload-do-not-depend-on-GNU-.patch \
file://0001-Smack-rules-create-two-new-functions.patch \
file://0002-app-install-implement-multiple-set-of-smack-rules.patch \
file://c-11-replace-depracated-auto_ptr.patch \
file://socket-manager-removes-tizen-specific-call.patch \
file://Removing-tizen-platform-config.patch \
file://removes-dependency-to-libslp-db-utils.patch \
"
