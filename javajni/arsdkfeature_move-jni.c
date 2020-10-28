/** Generated, do not edit ! */

static struct {
	jmethodID jmid_info;
} s_cb_move_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMove_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_move_cache.jmid_info = (*env)->GetStaticMethodID(env, jcls, "info", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMove$Callback;I)V");
}

static int evt_move_info(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t missing_inputs;
	int res = arsdk_cmd_dec_Move_Info(cmd, &missing_inputs);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_move_cache.jmid_info, callback, (jint)missing_inputs);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMove_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 170 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 3: return evt_move_info(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMove_nativeEncodeExtendedMoveTo(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude, jdouble longitude, jdouble altitude, jint orientation_mode, jfloat heading, jfloat max_horizontal_speed, jfloat max_vertical_speed, jfloat max_yaw_rotation_speed) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Move_Extended_move_to(cmd, latitude, longitude, altitude, orientation_mode, heading, max_horizontal_speed, max_vertical_speed, max_yaw_rotation_speed);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMove_nativeEncodeExtendedMoveBy(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat d_x, jfloat d_y, jfloat d_z, jfloat d_psi, jfloat max_horizontal_speed, jfloat max_vertical_speed, jfloat max_yaw_rotation_speed) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Move_Extended_move_by(cmd, d_x, d_y, d_z, d_psi, max_horizontal_speed, max_vertical_speed, max_yaw_rotation_speed);
	return res;
}

