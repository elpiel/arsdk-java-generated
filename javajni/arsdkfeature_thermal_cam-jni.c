/** Generated, do not edit ! */

static struct {
	jmethodID jmid_camera_state;
	jmethodID jmid_sensitivity;
	jmethodID jmid_calibration_infos;
	jmethodID jmid_charging_status;
	jmethodID jmid_flat_field_calibration_status;
	jmethodID jmid_flat_field_calibration_mode;
} s_cb_thermal_cam_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermalCam_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_thermal_cam_cache.jmid_camera_state = (*env)->GetStaticMethodID(env, jcls, "cameraState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermalCam$Callback;III)V");
	s_cb_thermal_cam_cache.jmid_sensitivity = (*env)->GetStaticMethodID(env, jcls, "sensitivity", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermalCam$Callback;IIII)V");
	s_cb_thermal_cam_cache.jmid_calibration_infos = (*env)->GetStaticMethodID(env, jcls, "calibrationInfos", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermalCam$Callback;IFFFI)V");
	s_cb_thermal_cam_cache.jmid_charging_status = (*env)->GetStaticMethodID(env, jcls, "chargingStatus", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermalCam$Callback;III)V");
	s_cb_thermal_cam_cache.jmid_flat_field_calibration_status = (*env)->GetStaticMethodID(env, jcls, "flatFieldCalibrationStatus", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermalCam$Callback;III)V");
	s_cb_thermal_cam_cache.jmid_flat_field_calibration_mode = (*env)->GetStaticMethodID(env, jcls, "flatFieldCalibrationMode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermalCam$Callback;III)V");
}

static int evt_thermal_cam_camera_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t state;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Thermal_cam_Camera_state(cmd, &cam_id, &state, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cam_cache.jmid_camera_state, callback, (jint)cam_id, (jint)state, (jint)list_flags);
	return 0;
}

static int evt_thermal_cam_sensitivity(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t current_range;
	uint8_t available_ranges;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Thermal_cam_Sensitivity(cmd, &cam_id, &current_range, &available_ranges, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cam_cache.jmid_sensitivity, callback, (jint)cam_id, (jint)current_range, (jint)available_ranges, (jint)list_flags);
	return 0;
}

static int evt_thermal_cam_calibration_infos(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	float roll;
	float pitch;
	float yaw;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Thermal_cam_Calibration_infos(cmd, &cam_id, &roll, &pitch, &yaw, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cam_cache.jmid_calibration_infos, callback, (jint)cam_id, (jfloat)roll, (jfloat)pitch, (jfloat)yaw, (jint)list_flags);
	return 0;
}

static int evt_thermal_cam_charging_status(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t state;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Thermal_cam_Charging_status(cmd, &cam_id, &state, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cam_cache.jmid_charging_status, callback, (jint)cam_id, (jint)state, (jint)list_flags);
	return 0;
}

static int evt_thermal_cam_flat_field_calibration_status(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t state;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Thermal_cam_Flat_field_calibration_status(cmd, &cam_id, &state, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cam_cache.jmid_flat_field_calibration_status, callback, (jint)cam_id, (jint)state, (jint)list_flags);
	return 0;
}

static int evt_thermal_cam_flat_field_calibration_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t mode;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Thermal_cam_Flat_field_calibration_mode(cmd, &cam_id, &mode, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cam_cache.jmid_flat_field_calibration_mode, callback, (jint)cam_id, (jint)mode, (jint)list_flags);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermalCam_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 142 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 3: return evt_thermal_cam_camera_state(env, jcls, cmd, callback);
		case 5: return evt_thermal_cam_sensitivity(env, jcls, cmd, callback);
		case 6: return evt_thermal_cam_calibration_infos(env, jcls, cmd, callback);
		case 7: return evt_thermal_cam_charging_status(env, jcls, cmd, callback);
		case 9: return evt_thermal_cam_flat_field_calibration_status(env, jcls, cmd, callback);
		case 11: return evt_thermal_cam_flat_field_calibration_mode(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermalCam_nativeEncodeActivate(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_cam_Activate(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermalCam_nativeEncodeDeactivate(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_cam_Deactivate(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermalCam_nativeEncodeSetSensitivity(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint range) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_cam_Set_sensitivity(cmd, cam_id, range);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermalCam_nativeEncodeFlatFieldCalibrate(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_cam_Flat_field_calibrate(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermalCam_nativeEncodeSetFlatFieldCalibrationMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_cam_Set_flat_field_calibration_mode(cmd, cam_id, mode);
	return res;
}

