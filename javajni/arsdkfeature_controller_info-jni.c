/** Generated, do not edit ! */

static struct {
	jmethodID jmid_validity_from_drone;
} s_cb_controller_info_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureControllerInfo_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_controller_info_cache.jmid_validity_from_drone = (*env)->GetStaticMethodID(env, jcls, "validityFromDrone", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureControllerInfo$Callback;I)V");
}

static int evt_controller_info_validity_from_drone(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t is_valid;
	int res = arsdk_cmd_dec_Controller_info_Validity_from_drone(cmd, &is_valid);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_controller_info_cache.jmid_validity_from_drone, callback, (jint)is_valid);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureControllerInfo_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 140 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 3: return evt_controller_info_validity_from_drone(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureControllerInfo_nativeEncodeGps(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude, jdouble longitude, jfloat altitude, jfloat horizontal_accuracy, jfloat vertical_accuracy, jfloat north_speed, jfloat east_speed, jfloat down_speed, jdouble timestamp) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Controller_info_Gps(cmd, latitude, longitude, altitude, horizontal_accuracy, vertical_accuracy, north_speed, east_speed, down_speed, timestamp);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureControllerInfo_nativeEncodeBarometer(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat pressure, jdouble timestamp) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Controller_info_Barometer(cmd, pressure, timestamp);
	return res;
}

