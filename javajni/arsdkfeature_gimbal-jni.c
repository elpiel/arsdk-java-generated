/** Generated, do not edit ! */

static struct {
	jmethodID jmid_gimbal_capabilities;
	jmethodID jmid_relative_attitude_bounds;
	jmethodID jmid_max_speed;
	jmethodID jmid_attitude;
	jmethodID jmid_axis_lock_state;
	jmethodID jmid_offsets;
	jmethodID jmid_absolute_attitude_bounds;
	jmethodID jmid_calibration_state;
	jmethodID jmid_calibration_result;
	jmethodID jmid_alert;
} s_cb_gimbal_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_gimbal_cache.jmid_gimbal_capabilities = (*env)->GetStaticMethodID(env, jcls, "gimbalCapabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;III)V");
	s_cb_gimbal_cache.jmid_relative_attitude_bounds = (*env)->GetStaticMethodID(env, jcls, "relativeAttitudeBounds", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;IFFFFFF)V");
	s_cb_gimbal_cache.jmid_max_speed = (*env)->GetStaticMethodID(env, jcls, "maxSpeed", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;IFFFFFFFFF)V");
	s_cb_gimbal_cache.jmid_attitude = (*env)->GetStaticMethodID(env, jcls, "attitude", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;IIIIFFFFFF)V");
	s_cb_gimbal_cache.jmid_axis_lock_state = (*env)->GetStaticMethodID(env, jcls, "axisLockState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;II)V");
	s_cb_gimbal_cache.jmid_offsets = (*env)->GetStaticMethodID(env, jcls, "offsets", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;IIFFFFFFFFF)V");
	s_cb_gimbal_cache.jmid_absolute_attitude_bounds = (*env)->GetStaticMethodID(env, jcls, "absoluteAttitudeBounds", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;IFFFFFF)V");
	s_cb_gimbal_cache.jmid_calibration_state = (*env)->GetStaticMethodID(env, jcls, "calibrationState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;II)V");
	s_cb_gimbal_cache.jmid_calibration_result = (*env)->GetStaticMethodID(env, jcls, "calibrationResult", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;II)V");
	s_cb_gimbal_cache.jmid_alert = (*env)->GetStaticMethodID(env, jcls, "alert", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureGimbal$Callback;II)V");
}

static int evt_gimbal_gimbal_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t gimbal_id;
	int32_t model;
	uint8_t axes;
	int res = arsdk_cmd_dec_Gimbal_Gimbal_capabilities(cmd, &gimbal_id, &model, &axes);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_gimbal_capabilities, callback, (jint)gimbal_id, (jint)model, (jint)axes);
	return 0;
}

static int evt_gimbal_relative_attitude_bounds(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t gimbal_id;
	float min_yaw;
	float max_yaw;
	float min_pitch;
	float max_pitch;
	float min_roll;
	float max_roll;
	int res = arsdk_cmd_dec_Gimbal_Relative_attitude_bounds(cmd, &gimbal_id, &min_yaw, &max_yaw, &min_pitch, &max_pitch, &min_roll, &max_roll);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_relative_attitude_bounds, callback, (jint)gimbal_id, (jfloat)min_yaw, (jfloat)max_yaw, (jfloat)min_pitch, (jfloat)max_pitch, (jfloat)min_roll, (jfloat)max_roll);
	return 0;
}

static int evt_gimbal_max_speed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t gimbal_id;
	float min_bound_yaw;
	float max_bound_yaw;
	float current_yaw;
	float min_bound_pitch;
	float max_bound_pitch;
	float current_pitch;
	float min_bound_roll;
	float max_bound_roll;
	float current_roll;
	int res = arsdk_cmd_dec_Gimbal_Max_speed(cmd, &gimbal_id, &min_bound_yaw, &max_bound_yaw, &current_yaw, &min_bound_pitch, &max_bound_pitch, &current_pitch, &min_bound_roll, &max_bound_roll, &current_roll);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_max_speed, callback, (jint)gimbal_id, (jfloat)min_bound_yaw, (jfloat)max_bound_yaw, (jfloat)current_yaw, (jfloat)min_bound_pitch, (jfloat)max_bound_pitch, (jfloat)current_pitch, (jfloat)min_bound_roll, (jfloat)max_bound_roll, (jfloat)current_roll);
	return 0;
}

static int evt_gimbal_attitude(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t gimbal_id;
	int32_t yaw_frame_of_reference;
	int32_t pitch_frame_of_reference;
	int32_t roll_frame_of_reference;
	float yaw_relative;
	float pitch_relative;
	float roll_relative;
	float yaw_absolute;
	float pitch_absolute;
	float roll_absolute;
	int res = arsdk_cmd_dec_Gimbal_Attitude(cmd, &gimbal_id, &yaw_frame_of_reference, &pitch_frame_of_reference, &roll_frame_of_reference, &yaw_relative, &pitch_relative, &roll_relative, &yaw_absolute, &pitch_absolute, &roll_absolute);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_attitude, callback, (jint)gimbal_id, (jint)yaw_frame_of_reference, (jint)pitch_frame_of_reference, (jint)roll_frame_of_reference, (jfloat)yaw_relative, (jfloat)pitch_relative, (jfloat)roll_relative, (jfloat)yaw_absolute, (jfloat)pitch_absolute, (jfloat)roll_absolute);
	return 0;
}

static int evt_gimbal_axis_lock_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t gimbal_id;
	uint8_t locked;
	int res = arsdk_cmd_dec_Gimbal_Axis_lock_state(cmd, &gimbal_id, &locked);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_axis_lock_state, callback, (jint)gimbal_id, (jint)locked);
	return 0;
}

static int evt_gimbal_offsets(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t gimbal_id;
	int32_t update_state;
	float min_bound_yaw;
	float max_bound_yaw;
	float current_yaw;
	float min_bound_pitch;
	float max_bound_pitch;
	float current_pitch;
	float min_bound_roll;
	float max_bound_roll;
	float current_roll;
	int res = arsdk_cmd_dec_Gimbal_Offsets(cmd, &gimbal_id, &update_state, &min_bound_yaw, &max_bound_yaw, &current_yaw, &min_bound_pitch, &max_bound_pitch, &current_pitch, &min_bound_roll, &max_bound_roll, &current_roll);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_offsets, callback, (jint)gimbal_id, (jint)update_state, (jfloat)min_bound_yaw, (jfloat)max_bound_yaw, (jfloat)current_yaw, (jfloat)min_bound_pitch, (jfloat)max_bound_pitch, (jfloat)current_pitch, (jfloat)min_bound_roll, (jfloat)max_bound_roll, (jfloat)current_roll);
	return 0;
}

static int evt_gimbal_absolute_attitude_bounds(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t gimbal_id;
	float min_yaw;
	float max_yaw;
	float min_pitch;
	float max_pitch;
	float min_roll;
	float max_roll;
	int res = arsdk_cmd_dec_Gimbal_Absolute_attitude_bounds(cmd, &gimbal_id, &min_yaw, &max_yaw, &min_pitch, &max_pitch, &min_roll, &max_roll);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_absolute_attitude_bounds, callback, (jint)gimbal_id, (jfloat)min_yaw, (jfloat)max_yaw, (jfloat)min_pitch, (jfloat)max_pitch, (jfloat)min_roll, (jfloat)max_roll);
	return 0;
}

static int evt_gimbal_calibration_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	uint8_t gimbal_id;
	int res = arsdk_cmd_dec_Gimbal_Calibration_state(cmd, &state, &gimbal_id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_calibration_state, callback, (jint)state, (jint)gimbal_id);
	return 0;
}

static int evt_gimbal_calibration_result(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t gimbal_id;
	int32_t result;
	int res = arsdk_cmd_dec_Gimbal_Calibration_result(cmd, &gimbal_id, &result);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_calibration_result, callback, (jint)gimbal_id, (jint)result);
	return 0;
}

static int evt_gimbal_alert(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t gimbal_id;
	uint8_t error;
	int res = arsdk_cmd_dec_Gimbal_Alert(cmd, &gimbal_id, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_gimbal_cache.jmid_alert, callback, (jint)gimbal_id, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 148 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_gimbal_gimbal_capabilities(env, jcls, cmd, callback);
		case 2: return evt_gimbal_relative_attitude_bounds(env, jcls, cmd, callback);
		case 3: return evt_gimbal_max_speed(env, jcls, cmd, callback);
		case 6: return evt_gimbal_attitude(env, jcls, cmd, callback);
		case 7: return evt_gimbal_axis_lock_state(env, jcls, cmd, callback);
		case 8: return evt_gimbal_offsets(env, jcls, cmd, callback);
		case 10: return evt_gimbal_absolute_attitude_bounds(env, jcls, cmd, callback);
		case 14: return evt_gimbal_calibration_state(env, jcls, cmd, callback);
		case 16: return evt_gimbal_calibration_result(env, jcls, cmd, callback);
		case 17: return evt_gimbal_alert(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeEncodeSetMaxSpeed(JNIEnv *env, jclass jcls, jlong nativeCmd, jint gimbal_id, jfloat yaw, jfloat pitch, jfloat roll) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gimbal_Set_max_speed(cmd, gimbal_id, yaw, pitch, roll);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeEncodeSetTarget(JNIEnv *env, jclass jcls, jlong nativeCmd, jint gimbal_id, jint control_mode, jint yaw_frame_of_reference, jfloat yaw, jint pitch_frame_of_reference, jfloat pitch, jint roll_frame_of_reference, jfloat roll) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gimbal_Set_target(cmd, gimbal_id, control_mode, yaw_frame_of_reference, yaw, pitch_frame_of_reference, pitch, roll_frame_of_reference, roll);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeEncodeSetOffsets(JNIEnv *env, jclass jcls, jlong nativeCmd, jint gimbal_id, jfloat yaw, jfloat pitch, jfloat roll) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gimbal_Set_offsets(cmd, gimbal_id, yaw, pitch, roll);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeEncodeResetOrientation(JNIEnv *env, jclass jcls, jlong nativeCmd, jint gimbal_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gimbal_Reset_orientation(cmd, gimbal_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeEncodeStartOffsetsUpdate(JNIEnv *env, jclass jcls, jlong nativeCmd, jint gimbal_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gimbal_Start_offsets_update(cmd, gimbal_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeEncodeStopOffsetsUpdate(JNIEnv *env, jclass jcls, jlong nativeCmd, jint gimbal_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gimbal_Stop_offsets_update(cmd, gimbal_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeEncodeCalibrate(JNIEnv *env, jclass jcls, jlong nativeCmd, jint gimbal_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gimbal_Calibrate(cmd, gimbal_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureGimbal_nativeEncodeCancelCalibration(JNIEnv *env, jclass jcls, jlong nativeCmd, jint gimbal_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Gimbal_Cancel_calibration(cmd, gimbal_id);
	return res;
}

