/** Generated, do not edit ! */

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGeneric_nativeEncodeDefault(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Generic_Default(cmd);
	return res;
}

