/** Generated, do not edit ! */

static struct {
	jmethodID jmid_capabilities;
	jmethodID jmid_dri_state;
	jmethodID jmid_drone_id;
} s_cb_dri_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDri_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_dri_cache.jmid_capabilities = (*env)->GetStaticMethodID(env, jcls, "capabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDri$Callback;I)V");
	s_cb_dri_cache.jmid_dri_state = (*env)->GetStaticMethodID(env, jcls, "driState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDri$Callback;I)V");
	s_cb_dri_cache.jmid_drone_id = (*env)->GetStaticMethodID(env, jcls, "droneId", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDri$Callback;ILjava/lang/String;)V");
}

static int evt_dri_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t supported_capabilities;
	int res = arsdk_cmd_dec_Dri_Capabilities(cmd, &supported_capabilities);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_dri_cache.jmid_capabilities, callback, (jint)supported_capabilities);
	return 0;
}

static int evt_dri_dri_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Dri_Dri_state(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_dri_cache.jmid_dri_state, callback, (jint)mode);
	return 0;
}

static int evt_dri_drone_id(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	const char * value;
	int res = arsdk_cmd_dec_Dri_Drone_id(cmd, &type, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_dri_cache.jmid_drone_id, callback, (jint)type, (*env)->NewStringUTF(env, value));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDri_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 164 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_dri_capabilities(env, jcls, cmd, callback);
		case 3: return evt_dri_dri_state(env, jcls, cmd, callback);
		case 4: return evt_dri_drone_id(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDri_nativeEncodeDriMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Dri_Dri_mode(cmd, mode);
	return res;
}

