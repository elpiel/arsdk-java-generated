/** Generated, do not edit ! */

static struct {
	jmethodID jmid_home_type_capabilities;
	jmethodID jmid_home_type;
	jmethodID jmid_preferred_home_type;
	jmethodID jmid_takeoff_location;
	jmethodID jmid_custom_location;
	jmethodID jmid_followee_location;
	jmethodID jmid_delay;
	jmethodID jmid_state;
	jmethodID jmid_home_reachability;
	jmethodID jmid_rth_auto_trigger;
	jmethodID jmid_min_altitude;
	jmethodID jmid_auto_trigger_mode;
	jmethodID jmid_ending_behavior;
	jmethodID jmid_ending_hovering_altitude;
} s_cb_rth_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_rth_cache.jmid_home_type_capabilities = (*env)->GetStaticMethodID(env, jcls, "homeTypeCapabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;I)V");
	s_cb_rth_cache.jmid_home_type = (*env)->GetStaticMethodID(env, jcls, "homeType", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;I)V");
	s_cb_rth_cache.jmid_preferred_home_type = (*env)->GetStaticMethodID(env, jcls, "preferredHomeType", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;I)V");
	s_cb_rth_cache.jmid_takeoff_location = (*env)->GetStaticMethodID(env, jcls, "takeoffLocation", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;DDFI)V");
	s_cb_rth_cache.jmid_custom_location = (*env)->GetStaticMethodID(env, jcls, "customLocation", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;DDF)V");
	s_cb_rth_cache.jmid_followee_location = (*env)->GetStaticMethodID(env, jcls, "followeeLocation", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;DDF)V");
	s_cb_rth_cache.jmid_delay = (*env)->GetStaticMethodID(env, jcls, "delay", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;III)V");
	s_cb_rth_cache.jmid_state = (*env)->GetStaticMethodID(env, jcls, "state", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;II)V");
	s_cb_rth_cache.jmid_home_reachability = (*env)->GetStaticMethodID(env, jcls, "homeReachability", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;I)V");
	s_cb_rth_cache.jmid_rth_auto_trigger = (*env)->GetStaticMethodID(env, jcls, "rthAutoTrigger", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;IJ)V");
	s_cb_rth_cache.jmid_min_altitude = (*env)->GetStaticMethodID(env, jcls, "minAltitude", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;FFF)V");
	s_cb_rth_cache.jmid_auto_trigger_mode = (*env)->GetStaticMethodID(env, jcls, "autoTriggerMode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;I)V");
	s_cb_rth_cache.jmid_ending_behavior = (*env)->GetStaticMethodID(env, jcls, "endingBehavior", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;I)V");
	s_cb_rth_cache.jmid_ending_hovering_altitude = (*env)->GetStaticMethodID(env, jcls, "endingHoveringAltitude", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureRth$Callback;FFF)V");
}

static int evt_rth_home_type_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t values;
	int res = arsdk_cmd_dec_Rth_Home_type_capabilities(cmd, &values);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_home_type_capabilities, callback, (jint)values);
	return 0;
}

static int evt_rth_home_type(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int res = arsdk_cmd_dec_Rth_Home_type(cmd, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_home_type, callback, (jint)type);
	return 0;
}

static int evt_rth_preferred_home_type(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int res = arsdk_cmd_dec_Rth_Preferred_home_type(cmd, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_preferred_home_type, callback, (jint)type);
	return 0;
}

static int evt_rth_takeoff_location(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	float altitude;
	uint8_t fixed_before_takeoff;
	int res = arsdk_cmd_dec_Rth_Takeoff_location(cmd, &latitude, &longitude, &altitude, &fixed_before_takeoff);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_takeoff_location, callback, (jdouble)latitude, (jdouble)longitude, (jfloat)altitude, (jint)fixed_before_takeoff);
	return 0;
}

static int evt_rth_custom_location(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	float altitude;
	int res = arsdk_cmd_dec_Rth_Custom_location(cmd, &latitude, &longitude, &altitude);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_custom_location, callback, (jdouble)latitude, (jdouble)longitude, (jfloat)altitude);
	return 0;
}

static int evt_rth_followee_location(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	float altitude;
	int res = arsdk_cmd_dec_Rth_Followee_location(cmd, &latitude, &longitude, &altitude);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_followee_location, callback, (jdouble)latitude, (jdouble)longitude, (jfloat)altitude);
	return 0;
}

static int evt_rth_delay(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t delay;
	uint16_t min;
	uint16_t max;
	int res = arsdk_cmd_dec_Rth_Delay(cmd, &delay, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_delay, callback, (jint)delay, (jint)min, (jint)max);
	return 0;
}

static int evt_rth_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t reason;
	int res = arsdk_cmd_dec_Rth_State(cmd, &state, &reason);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_state, callback, (jint)state, (jint)reason);
	return 0;
}

static int evt_rth_home_reachability(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t status;
	int res = arsdk_cmd_dec_Rth_Home_reachability(cmd, &status);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_home_reachability, callback, (jint)status);
	return 0;
}

static int evt_rth_rth_auto_trigger(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t reason;
	uint32_t delay;
	int res = arsdk_cmd_dec_Rth_Rth_auto_trigger(cmd, &reason, &delay);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_rth_auto_trigger, callback, (jint)reason, (jlong)delay);
	return 0;
}

static int evt_rth_min_altitude(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Rth_Min_altitude(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_min_altitude, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_rth_auto_trigger_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Rth_Auto_trigger_mode(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_auto_trigger_mode, callback, (jint)mode);
	return 0;
}

static int evt_rth_ending_behavior(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t ending_behavior;
	int res = arsdk_cmd_dec_Rth_Ending_behavior(cmd, &ending_behavior);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_ending_behavior, callback, (jint)ending_behavior);
	return 0;
}

static int evt_rth_ending_hovering_altitude(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Rth_Ending_hovering_altitude(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_rth_cache.jmid_ending_hovering_altitude, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 146 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_rth_home_type_capabilities(env, jcls, cmd, callback);
		case 2: return evt_rth_home_type(env, jcls, cmd, callback);
		case 3: return evt_rth_preferred_home_type(env, jcls, cmd, callback);
		case 5: return evt_rth_takeoff_location(env, jcls, cmd, callback);
		case 7: return evt_rth_custom_location(env, jcls, cmd, callback);
		case 8: return evt_rth_followee_location(env, jcls, cmd, callback);
		case 10: return evt_rth_delay(env, jcls, cmd, callback);
		case 13: return evt_rth_state(env, jcls, cmd, callback);
		case 14: return evt_rth_home_reachability(env, jcls, cmd, callback);
		case 15: return evt_rth_rth_auto_trigger(env, jcls, cmd, callback);
		case 18: return evt_rth_min_altitude(env, jcls, cmd, callback);
		case 20: return evt_rth_auto_trigger_mode(env, jcls, cmd, callback);
		case 22: return evt_rth_ending_behavior(env, jcls, cmd, callback);
		case 24: return evt_rth_ending_hovering_altitude(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeSetPreferredHomeType(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Set_preferred_home_type(cmd, type);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeSetCustomLocation(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude, jdouble longitude, jfloat altitude) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Set_custom_location(cmd, latitude, longitude, altitude);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeSetDelay(JNIEnv *env, jclass jcls, jlong nativeCmd, jint delay) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Set_delay(cmd, delay);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeReturnToHome(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Return_to_home(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeAbort(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Abort(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeCancelAutoTrigger(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Cancel_auto_trigger(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeSetMinAltitude(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat altitude) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Set_min_altitude(cmd, altitude);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeSetAutoTriggerMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Set_auto_trigger_mode(cmd, mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeSetEndingBehavior(JNIEnv *env, jclass jcls, jlong nativeCmd, jint ending_behavior) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Set_ending_behavior(cmd, ending_behavior);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureRth_nativeEncodeSetEndingHoveringAltitude(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat altitude) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Rth_Set_ending_hovering_altitude(cmd, altitude);
	return res;
}

