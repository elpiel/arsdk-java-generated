/** Generated, do not edit ! */

static struct {
	jmethodID jmid_status;
	jmethodID jmid_progress;
} s_cb_gauge_fw_updater_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGaugeFwUpdater_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_gauge_fw_updater_cache.jmid_status = (*env)->GetStaticMethodID(env, jcls, "status", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGaugeFwUpdater$Callback;III)V");
	s_cb_gauge_fw_updater_cache.jmid_progress = (*env)->GetStaticMethodID(env, jcls, "progress", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGaugeFwUpdater$Callback;II)V");
}

static int evt_gauge_fw_updater_status(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t diag;
	uint32_t missing_requirements;
	int32_t state;
	int res = arsdk_cmd_dec_Gauge_fw_updater_Status(cmd, &diag, &missing_requirements, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gauge_fw_updater_cache.jmid_status, callback, (jint)diag, (jint)missing_requirements, (jint)state);
	return 0;
}

static int evt_gauge_fw_updater_progress(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t result;
	uint8_t percent;
	int res = arsdk_cmd_dec_Gauge_fw_updater_Progress(cmd, &result, &percent);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gauge_fw_updater_cache.jmid_progress, callback, (jint)result, (jint)percent);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGaugeFwUpdater_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 160 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 3: return evt_gauge_fw_updater_status(env, jcls, cmd, callback);
		case 4: return evt_gauge_fw_updater_progress(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGaugeFwUpdater_nativeEncodePrepare(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gauge_fw_updater_Prepare(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGaugeFwUpdater_nativeEncodeUpdate(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gauge_fw_updater_Update(cmd);
	return res;
}

