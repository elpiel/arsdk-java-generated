/** Generated, do not edit ! */

static struct {
	jmethodID jmid_alert;
	jmethodID jmid_health;
	jmethodID jmid_voltage;
	jmethodID jmid_cycle_count;
	jmethodID jmid_serial;
} s_cb_battery_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureBattery_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_battery_cache.jmid_alert = (*env)->GetStaticMethodID(env, jcls, "alert", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureBattery$Callback;III)V");
	s_cb_battery_cache.jmid_health = (*env)->GetStaticMethodID(env, jcls, "health", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureBattery$Callback;I)V");
	s_cb_battery_cache.jmid_voltage = (*env)->GetStaticMethodID(env, jcls, "voltage", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureBattery$Callback;I)V");
	s_cb_battery_cache.jmid_cycle_count = (*env)->GetStaticMethodID(env, jcls, "cycleCount", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureBattery$Callback;J)V");
	s_cb_battery_cache.jmid_serial = (*env)->GetStaticMethodID(env, jcls, "serial", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureBattery$Callback;Ljava/lang/String;)V");
}

static int evt_battery_alert(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t alert;
	int32_t level;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Battery_Alert(cmd, &alert, &level, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_battery_cache.jmid_alert, callback, (jint)alert, (jint)level, (jint)list_flags);
	return 0;
}

static int evt_battery_health(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state_of_health;
	int res = arsdk_cmd_dec_Battery_Health(cmd, &state_of_health);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_battery_cache.jmid_health, callback, (jint)state_of_health);
	return 0;
}

static int evt_battery_voltage(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t voltage;
	int res = arsdk_cmd_dec_Battery_Voltage(cmd, &voltage);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_battery_cache.jmid_voltage, callback, (jint)voltage);
	return 0;
}

static int evt_battery_cycle_count(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t count;
	int res = arsdk_cmd_dec_Battery_Cycle_count(cmd, &count);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_battery_cache.jmid_cycle_count, callback, (jlong)count);
	return 0;
}

static int evt_battery_serial(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * serial;
	int res = arsdk_cmd_dec_Battery_Serial(cmd, &serial);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_battery_cache.jmid_serial, callback, (*env)->NewStringUTF(env, serial));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureBattery_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 149 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_battery_alert(env, jcls, cmd, callback);
		case 2: return evt_battery_health(env, jcls, cmd, callback);
		case 3: return evt_battery_voltage(env, jcls, cmd, callback);
		case 4: return evt_battery_cycle_count(env, jcls, cmd, callback);
		case 5: return evt_battery_serial(env, jcls, cmd, callback);
	}
	return -1;
}

