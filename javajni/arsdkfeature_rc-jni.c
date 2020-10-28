/** Generated, do not edit ! */

static struct {
	jmethodID jmid_receiver_state;
	jmethodID jmid_channels_monitor_state;
	jmethodID jmid_channel_value;
	jmethodID jmid_calibration_state;
	jmethodID jmid_channel_action_item;
} s_cb_rc_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRc_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_rc_cache.jmid_receiver_state = (*env)->GetStaticMethodID(env, jcls, "receiverState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRc$Callback;ILjava/lang/String;I)V");
	s_cb_rc_cache.jmid_channels_monitor_state = (*env)->GetStaticMethodID(env, jcls, "channelsMonitorState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRc$Callback;I)V");
	s_cb_rc_cache.jmid_channel_value = (*env)->GetStaticMethodID(env, jcls, "channelValue", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRc$Callback;IIII)V");
	s_cb_rc_cache.jmid_calibration_state = (*env)->GetStaticMethodID(env, jcls, "calibrationState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRc$Callback;IIIII)V");
	s_cb_rc_cache.jmid_channel_action_item = (*env)->GetStaticMethodID(env, jcls, "channelActionItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRc$Callback;IIII)V");
}

static int evt_rc_receiver_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	const char * protocol;
	uint8_t enabled;
	int res = arsdk_cmd_dec_Rc_Receiver_state(cmd, &state, &protocol, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rc_cache.jmid_receiver_state, callback, (jint)state, (*env)->NewStringUTF(env, protocol), (jint)enabled);
	return 0;
}

static int evt_rc_channels_monitor_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	int res = arsdk_cmd_dec_Rc_Channels_monitor_state(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rc_cache.jmid_channels_monitor_state, callback, (jint)state);
	return 0;
}

static int evt_rc_channel_value(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t id;
	int32_t action;
	int16_t value;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Rc_Channel_value(cmd, &id, &action, &value, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rc_cache.jmid_channel_value, callback, (jint)id, (jint)action, (jint)value, (jint)list_flags);
	return 0;
}

static int evt_rc_calibration_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t calibration_type;
	int32_t channel_action;
	uint32_t required;
	uint32_t calibrated;
	uint8_t neutral_calibrated;
	int res = arsdk_cmd_dec_Rc_Calibration_state(cmd, &calibration_type, &channel_action, &required, &calibrated, &neutral_calibrated);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rc_cache.jmid_calibration_state, callback, (jint)calibration_type, (jint)channel_action, (jint)required, (jint)calibrated, (jint)neutral_calibrated);
	return 0;
}

static int evt_rc_channel_action_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t action;
	uint32_t supported_type;
	int32_t calibrated_type;
	uint8_t inverted;
	int res = arsdk_cmd_dec_Rc_Channel_action_item(cmd, &action, &supported_type, &calibrated_type, &inverted);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rc_cache.jmid_channel_action_item, callback, (jint)action, (jint)supported_type, (jint)calibrated_type, (jint)inverted);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRc_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 136 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_rc_receiver_state(env, jcls, cmd, callback);
		case 3: return evt_rc_channels_monitor_state(env, jcls, cmd, callback);
		case 4: return evt_rc_channel_value(env, jcls, cmd, callback);
		case 5: return evt_rc_calibration_state(env, jcls, cmd, callback);
		case 12: return evt_rc_channel_action_item(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRc_nativeEncodeMonitorChannels(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rc_Monitor_channels(cmd, enable);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRc_nativeEncodeStartCalibration(JNIEnv *env, jclass jcls, jlong nativeCmd, jint calibration_type, jint channel_action, jint channel_type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rc_Start_calibration(cmd, calibration_type, channel_action, channel_type);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRc_nativeEncodeInvertChannel(JNIEnv *env, jclass jcls, jlong nativeCmd, jint action, jint flag) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rc_Invert_channel(cmd, action, flag);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRc_nativeEncodeAbortCalibration(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rc_Abort_calibration(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRc_nativeEncodeResetCalibration(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rc_Reset_calibration(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRc_nativeEncodeEnableReceiver(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rc_Enable_receiver(cmd, enable);
	return res;
}

