/** Generated, do not edit ! */

static struct {
	jmethodID jmid_drone_list_item;
	jmethodID jmid_connection_state;
	jmethodID jmid_authentication_failed;
	jmethodID jmid_connection_refused;
	jmethodID jmid_known_drone_item;
} s_cb_drone_manager_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDroneManager_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_drone_manager_cache.jmid_drone_list_item = (*env)->GetStaticMethodID(env, jcls, "droneListItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDroneManager$Callback;Ljava/lang/String;ILjava/lang/String;IIIIIII)V");
	s_cb_drone_manager_cache.jmid_connection_state = (*env)->GetStaticMethodID(env, jcls, "connectionState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDroneManager$Callback;ILjava/lang/String;ILjava/lang/String;)V");
	s_cb_drone_manager_cache.jmid_authentication_failed = (*env)->GetStaticMethodID(env, jcls, "authenticationFailed", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDroneManager$Callback;Ljava/lang/String;ILjava/lang/String;)V");
	s_cb_drone_manager_cache.jmid_connection_refused = (*env)->GetStaticMethodID(env, jcls, "connectionRefused", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDroneManager$Callback;Ljava/lang/String;ILjava/lang/String;)V");
	s_cb_drone_manager_cache.jmid_known_drone_item = (*env)->GetStaticMethodID(env, jcls, "knownDroneItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDroneManager$Callback;Ljava/lang/String;ILjava/lang/String;III)V");
}

static int evt_drone_manager_drone_list_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * serial;
	uint16_t model;
	const char * name;
	uint8_t connection_order;
	uint8_t active;
	uint8_t visible;
	int32_t security;
	uint8_t has_saved_key;
	int8_t rssi;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Drone_manager_Drone_list_item(cmd, &serial, &model, &name, &connection_order, &active, &visible, &security, &has_saved_key, &rssi, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_drone_manager_cache.jmid_drone_list_item, callback, (*env)->NewStringUTF(env, serial), (jint)model, (*env)->NewStringUTF(env, name), (jint)connection_order, (jint)active, (jint)visible, (jint)security, (jint)has_saved_key, (jint)rssi, (jint)list_flags);
	return 0;
}

static int evt_drone_manager_connection_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	const char * serial;
	uint16_t model;
	const char * name;
	int res = arsdk_cmd_dec_Drone_manager_Connection_state(cmd, &state, &serial, &model, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_drone_manager_cache.jmid_connection_state, callback, (jint)state, (*env)->NewStringUTF(env, serial), (jint)model, (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_drone_manager_authentication_failed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * serial;
	uint16_t model;
	const char * name;
	int res = arsdk_cmd_dec_Drone_manager_Authentication_failed(cmd, &serial, &model, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_drone_manager_cache.jmid_authentication_failed, callback, (*env)->NewStringUTF(env, serial), (jint)model, (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_drone_manager_connection_refused(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * serial;
	uint16_t model;
	const char * name;
	int res = arsdk_cmd_dec_Drone_manager_Connection_refused(cmd, &serial, &model, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_drone_manager_cache.jmid_connection_refused, callback, (*env)->NewStringUTF(env, serial), (jint)model, (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_drone_manager_known_drone_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * serial;
	uint16_t model;
	const char * name;
	int32_t security;
	uint8_t has_saved_key;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Drone_manager_Known_drone_item(cmd, &serial, &model, &name, &security, &has_saved_key, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_drone_manager_cache.jmid_known_drone_item, callback, (*env)->NewStringUTF(env, serial), (jint)model, (*env)->NewStringUTF(env, name), (jint)security, (jint)has_saved_key, (jint)list_flags);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDroneManager_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 137 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 2: return evt_drone_manager_drone_list_item(env, jcls, cmd, callback);
		case 5: return evt_drone_manager_connection_state(env, jcls, cmd, callback);
		case 6: return evt_drone_manager_authentication_failed(env, jcls, cmd, callback);
		case 7: return evt_drone_manager_connection_refused(env, jcls, cmd, callback);
		case 8: return evt_drone_manager_known_drone_item(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDroneManager_nativeEncodeDiscoverDrones(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Drone_manager_Discover_drones(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDroneManager_nativeEncodeConnect(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring serial, jstring key) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_serial = (*env)->GetStringUTFChars(env, serial, NULL);
	const char* c_key = (*env)->GetStringUTFChars(env, key, NULL);
	int res = arsdk_cmd_enc_Drone_manager_Connect(cmd, c_serial, c_key);
	if (c_serial != NULL) (*env)->ReleaseStringUTFChars(env, serial, c_serial);
	if (c_key != NULL) (*env)->ReleaseStringUTFChars(env, key, c_key);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDroneManager_nativeEncodeForget(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring serial) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_serial = (*env)->GetStringUTFChars(env, serial, NULL);
	int res = arsdk_cmd_enc_Drone_manager_Forget(cmd, c_serial);
	if (c_serial != NULL) (*env)->ReleaseStringUTFChars(env, serial, c_serial);
	return res;
}

