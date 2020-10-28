/** Generated, do not edit ! */
package com.parrot.drone.sdkcore.arsdk;

import com.parrot.drone.sdkcore.arsdk.command.ArsdkCommand;
import androidx.annotation.NonNull;
import org.hamcrest.Description;
import java.util.List;
@SuppressWarnings("All")
public abstract class ExpectedCmd {
    public abstract boolean match(ArsdkCommand cmd, boolean checkParams);
    public abstract void describeExpected(Description description);

    public abstract void describeMismatch(ArsdkCommand cmd, Description description);

    public static boolean cmpCmds(@NonNull List<ArsdkCommand> cmds1, @NonNull List<ArsdkCommand> cmds2) {
        for (ArsdkCommand cmd1 : cmds1) {
            boolean found = false;
            for (ArsdkCommand cmd2 : cmds2) {
                if ((cmd2.getCommandId() == cmd1.getCommandId()) &&
                    (cmd2.getData().equals(cmd2.getData()))) {
                    cmds2.remove(cmd2);
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return (cmds2.size() == 0);
    }

    public static ExpectedCmd commonNetworkDisconnect() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)0,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonSettingsAllSettings() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonSettingsReset() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonSettingsProductName(final String name) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readString().equals(name));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2,(short)2));
                description.appendText(", name ").appendValue(name);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _name = dec.readString();
                    if (!(_name.equals(name))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("name was ").appendValue(_name);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonSettingsCountry(final String code) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readString().equals(code));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2,(short)3));
                description.appendText(", code ").appendValue(code);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _code = dec.readString();
                    if (!(_code.equals(code))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("code was ").appendValue(_code);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonSettingsAutoCountry(final int automatic) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == automatic);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2,(short)4));
                description.appendText(", automatic ").appendValue(automatic);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _automatic = dec.readUnsignedByte();
                    if (!(_automatic == automatic)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("automatic was ").appendValue(_automatic);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonCommonAllStates() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)4,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonCommonCurrentDate(final String date) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readString().equals(date));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)4,(short)1));
                description.appendText(", date ").appendValue(date);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _date = dec.readString();
                    if (!(_date.equals(date))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("date was ").appendValue(_date);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonCommonCurrentTime(final String time) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readString().equals(time));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)4,(short)2));
                description.appendText(", time ").appendValue(time);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _time = dec.readString();
                    if (!(_time.equals(time))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("time was ").appendValue(_time);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonCommonReboot() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 3)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)4,(short)3));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonCommonCurrentDateTime(final String datetime) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readString().equals(datetime));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)4,(short)4));
                description.appendText(", datetime ").appendValue(datetime);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _datetime = dec.readString();
                    if (!(_datetime.equals(datetime))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("datetime was ").appendValue(_datetime);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonOverHeatSwitchOff() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)6,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonOverHeatVentilate() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)6,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonControllerIsPiloting(final int piloting) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == piloting);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)8,(short)0));
                description.appendText(", piloting ").appendValue(piloting);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _piloting = dec.readUnsignedByte();
                    if (!(_piloting == piloting)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("piloting was ").appendValue(_piloting);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonControllerPeerStateChanged(final ArsdkFeatureCommon.ControllerPeerstatechangedState state, final ArsdkFeatureCommon.ControllerPeerstatechangedType type, final String peername, final String peerid, final String peertype) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == state.value) && (dec.readSignedInt() == type.value) && (dec.readString().equals(peername)) && (dec.readString().equals(peerid)) && (dec.readString().equals(peertype));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)8,(short)1));
                description.appendText(", state ").appendValue(state);
                description.appendText(", type ").appendValue(type);
                description.appendText(", peername ").appendValue(peername);
                description.appendText(", peerid ").appendValue(peerid);
                description.appendText(", peertype ").appendValue(peertype);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _state = dec.readSignedInt();
                    if (!(_state == state.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("state was ").appendValue(ArsdkFeatureCommon.ControllerPeerstatechangedState.fromValue(_state));
                    }
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureCommon.ControllerPeerstatechangedType.fromValue(_type));
                    }
                    String _peername = dec.readString();
                    if (!(_peername.equals(peername))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("peername was ").appendValue(_peername);
                    }
                    String _peerid = dec.readString();
                    if (!(_peerid.equals(peerid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("peerid was ").appendValue(_peerid);
                    }
                    String _peertype = dec.readString();
                    if (!(_peertype.equals(peertype))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("peertype was ").appendValue(_peertype);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonWifiSettingsOutdoorSetting(final int outdoor) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == outdoor);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)9,(short)0));
                description.appendText(", outdoor ").appendValue(outdoor);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _outdoor = dec.readUnsignedByte();
                    if (!(_outdoor == outdoor)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("outdoor was ").appendValue(_outdoor);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonMavlinkStart(final String filepath, final ArsdkFeatureCommon.MavlinkStartType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readString().equals(filepath)) && (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)11,(short)0));
                description.appendText(", filepath ").appendValue(filepath);
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _filepath = dec.readString();
                    if (!(_filepath.equals(filepath))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("filepath was ").appendValue(_filepath);
                    }
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureCommon.MavlinkStartType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonMavlinkPause() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)11,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonMavlinkStop() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)11,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonCalibrationMagnetoCalibration(final int calibrate) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == calibrate);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)13,(short)0));
                description.appendText(", calibrate ").appendValue(calibrate);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _calibrate = dec.readUnsignedByte();
                    if (!(_calibrate == calibrate)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("calibrate was ").appendValue(_calibrate);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonCalibrationPitotCalibration(final int calibrate) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == calibrate);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)13,(short)1));
                description.appendText(", calibrate ").appendValue(calibrate);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _calibrate = dec.readUnsignedByte();
                    if (!(_calibrate == calibrate)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("calibrate was ").appendValue(_calibrate);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonGPSControllerPositionForRun(final double latitude, final double longitude) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readDouble() == latitude) && (dec.readDouble() == longitude);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)16,(short)0));
                description.appendText(", latitude ").appendValue(latitude);
                description.appendText(", longitude ").appendValue(longitude);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonAudioControllerReadyForStreaming(final int ready) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == ready);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)20,(short)0));
                description.appendText(", ready ").appendValue(ready);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _ready = dec.readUnsignedByte();
                    if (!(_ready == ready)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("ready was ").appendValue(_ready);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonHeadlightsIntensity(final int left, final int right) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 22 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == left) && (dec.readUnsignedByte() == right);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)22,(short)0));
                description.appendText(", left ").appendValue(left);
                description.appendText(", right ").appendValue(right);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 22 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _left = dec.readUnsignedByte();
                    if (!(_left == left)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("left was ").appendValue(_left);
                    }
                    int _right = dec.readUnsignedByte();
                    if (!(_right == right)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("right was ").appendValue(_right);
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonAnimationsStartAnimation(final ArsdkFeatureCommon.AnimationsStartanimationAnim anim) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == anim.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)24,(short)0));
                description.appendText(", anim ").appendValue(anim);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _anim = dec.readSignedInt();
                    if (!(_anim == anim.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("anim was ").appendValue(ArsdkFeatureCommon.AnimationsStartanimationAnim.fromValue(_anim));
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonAnimationsStopAnimation(final ArsdkFeatureCommon.AnimationsStopanimationAnim anim) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == anim.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)24,(short)1));
                description.appendText(", anim ").appendValue(anim);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _anim = dec.readSignedInt();
                    if (!(_anim == anim.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("anim was ").appendValue(ArsdkFeatureCommon.AnimationsStopanimationAnim.fromValue(_anim));
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonAnimationsStopAllAnimations() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)24,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonAccessoryConfig(final ArsdkFeatureCommon.AccessoryConfigAccessory accessory) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 26 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == accessory.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)26,(short)0));
                description.appendText(", accessory ").appendValue(accessory);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 26 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _accessory = dec.readSignedInt();
                    if (!(_accessory == accessory.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("accessory was ").appendValue(ArsdkFeatureCommon.AccessoryConfigAccessory.fromValue(_accessory));
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonChargerSetMaxChargeRate(final ArsdkFeatureCommon.ChargerSetmaxchargerateRate rate) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 28 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == rate.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)28,(short)0));
                description.appendText(", rate ").appendValue(rate);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 28 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _rate = dec.readSignedInt();
                    if (!(_rate == rate.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rate was ").appendValue(ArsdkFeatureCommon.ChargerSetmaxchargerateRate.fromValue(_rate));
                    }
                }
            }
        };
    }

    public static ExpectedCmd commonFactoryReset() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 31 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)31,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 31 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd commonFlightPlanSettingsReturnHomeOnDisconnect(final int value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 32 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)32,(short)0));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 0 || dec.readUnsignedByte() != 32 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _value = dec.readUnsignedByte();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingTakeOff() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingPCMD(final int flag, final int roll, final int pitch, final int yaw, final int gaz, final long timestampandseqnum) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == flag) && (dec.readSignedByte() == roll) && (dec.readSignedByte() == pitch) && (dec.readSignedByte() == yaw) && (dec.readSignedByte() == gaz) && (dec.readUnsignedInt() == timestampandseqnum);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)2));
                description.appendText(", flag ").appendValue(flag);
                description.appendText(", roll ").appendValue(roll);
                description.appendText(", pitch ").appendValue(pitch);
                description.appendText(", yaw ").appendValue(yaw);
                description.appendText(", gaz ").appendValue(gaz);
                description.appendText(", timestampandseqnum ").appendValue(timestampandseqnum);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _flag = dec.readUnsignedByte();
                    if (!(_flag == flag)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("flag was ").appendValue(_flag);
                    }
                    int _roll = dec.readSignedByte();
                    if (!(_roll == roll)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("roll was ").appendValue(_roll);
                    }
                    int _pitch = dec.readSignedByte();
                    if (!(_pitch == pitch)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pitch was ").appendValue(_pitch);
                    }
                    int _yaw = dec.readSignedByte();
                    if (!(_yaw == yaw)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("yaw was ").appendValue(_yaw);
                    }
                    int _gaz = dec.readSignedByte();
                    if (!(_gaz == gaz)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gaz was ").appendValue(_gaz);
                    }
                    long _timestampandseqnum = dec.readUnsignedInt();
                    if (!(_timestampandseqnum == timestampandseqnum)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("timestampandseqnum was ").appendValue(_timestampandseqnum);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingLanding() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)3));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingEmergency() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)4));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingNavigateHome(final int start) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == start);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)5));
                description.appendText(", start ").appendValue(start);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _start = dec.readUnsignedByte();
                    if (!(_start == start)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("start was ").appendValue(_start);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingMoveBy(final float dx, final float dy, final float dz, final float dpsi) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    return false;
                return !checkParams || (dec.readFloat() == dx) && (dec.readFloat() == dy) && (dec.readFloat() == dz) && (dec.readFloat() == dpsi);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)7));
                description.appendText(", dx ").appendValue(dx);
                description.appendText(", dy ").appendValue(dy);
                description.appendText(", dz ").appendValue(dz);
                description.appendText(", dpsi ").appendValue(dpsi);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _dx = dec.readFloat();
                    if (!(_dx == dx)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("dx was ").appendValue(_dx);
                    }
                    float _dy = dec.readFloat();
                    if (!(_dy == dy)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("dy was ").appendValue(_dy);
                    }
                    float _dz = dec.readFloat();
                    if (!(_dz == dz)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("dz was ").appendValue(_dz);
                    }
                    float _dpsi = dec.readFloat();
                    if (!(_dpsi == dpsi)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("dpsi was ").appendValue(_dpsi);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingUserTakeOff(final int state) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == state);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)8));
                description.appendText(", state ").appendValue(state);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _state = dec.readUnsignedByte();
                    if (!(_state == state)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("state was ").appendValue(_state);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingCircle(final ArsdkFeatureArdrone3.PilotingCircleDirection direction) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    return false;
                return !checkParams || (dec.readSignedInt() == direction.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)9));
                description.appendText(", direction ").appendValue(direction);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _direction = dec.readSignedInt();
                    if (!(_direction == direction.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("direction was ").appendValue(ArsdkFeatureArdrone3.PilotingCircleDirection.fromValue(_direction));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingMoveTo(final double latitude, final double longitude, final double altitude, final ArsdkFeatureArdrone3.PilotingMovetoOrientationMode orientationMode, final float heading) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    return false;
                return !checkParams || (dec.readDouble() == latitude) && (dec.readDouble() == longitude) && (dec.readDouble() == altitude) && (dec.readSignedInt() == orientationMode.value) && (dec.readFloat() == heading);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)10));
                description.appendText(", latitude ").appendValue(latitude);
                description.appendText(", longitude ").appendValue(longitude);
                description.appendText(", altitude ").appendValue(altitude);
                description.appendText(", orientationMode ").appendValue(orientationMode);
                description.appendText(", heading ").appendValue(heading);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                    double _altitude = dec.readDouble();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                    int _orientationMode = dec.readSignedInt();
                    if (!(_orientationMode == orientationMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("orientationMode was ").appendValue(ArsdkFeatureArdrone3.PilotingMovetoOrientationMode.fromValue(_orientationMode));
                    }
                    float _heading = dec.readFloat();
                    if (!(_heading == heading)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("heading was ").appendValue(_heading);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingCancelMoveTo() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)11));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingStartPilotedPOI(final double latitude, final double longitude, final double altitude) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readDouble() == latitude) && (dec.readDouble() == longitude) && (dec.readDouble() == altitude);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)12));
                description.appendText(", latitude ").appendValue(latitude);
                description.appendText(", longitude ").appendValue(longitude);
                description.appendText(", altitude ").appendValue(altitude);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                    double _altitude = dec.readDouble();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingStopPilotedPOI() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 13)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)13));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 13)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingCancelMoveBy() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)14));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingStartPilotedPOIV2(final double latitude, final double longitude, final double altitude, final ArsdkFeatureArdrone3.PilotingStartpilotedpoiv2Mode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 15)
                    return false;
                return !checkParams || (dec.readDouble() == latitude) && (dec.readDouble() == longitude) && (dec.readDouble() == altitude) && (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)256,(short)15));
                description.appendText(", latitude ").appendValue(latitude);
                description.appendText(", longitude ").appendValue(longitude);
                description.appendText(", altitude ").appendValue(altitude);
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 15)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                    double _altitude = dec.readDouble();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureArdrone3.PilotingStartpilotedpoiv2Mode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3CameraOrientation(final int tilt, final int pan) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedByte() == tilt) && (dec.readSignedByte() == pan);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)257,(short)0));
                description.appendText(", tilt ").appendValue(tilt);
                description.appendText(", pan ").appendValue(pan);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _tilt = dec.readSignedByte();
                    if (!(_tilt == tilt)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("tilt was ").appendValue(_tilt);
                    }
                    int _pan = dec.readSignedByte();
                    if (!(_pan == pan)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pan was ").appendValue(_pan);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3CameraOrientationV2(final float tilt, final float pan) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readFloat() == tilt) && (dec.readFloat() == pan);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)257,(short)1));
                description.appendText(", tilt ").appendValue(tilt);
                description.appendText(", pan ").appendValue(pan);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _tilt = dec.readFloat();
                    if (!(_tilt == tilt)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("tilt was ").appendValue(_tilt);
                    }
                    float _pan = dec.readFloat();
                    if (!(_pan == pan)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pan was ").appendValue(_pan);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3CameraVelocity(final float tilt, final float pan) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readFloat() == tilt) && (dec.readFloat() == pan);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)257,(short)2));
                description.appendText(", tilt ").appendValue(tilt);
                description.appendText(", pan ").appendValue(pan);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _tilt = dec.readFloat();
                    if (!(_tilt == tilt)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("tilt was ").appendValue(_tilt);
                    }
                    float _pan = dec.readFloat();
                    if (!(_pan == pan)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pan was ").appendValue(_pan);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsMaxAltitude(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)0));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsMaxTilt(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)1));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsAbsolutControl(final int on) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == on);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)2));
                description.appendText(", on ").appendValue(on);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _on = dec.readUnsignedByte();
                    if (!(_on == on)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("on was ").appendValue(_on);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsMaxDistance(final float value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readFloat() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)3));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _value = dec.readFloat();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsNoFlyOverMaxDistance(final int shouldnotflyover) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == shouldnotflyover);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)4));
                description.appendText(", shouldnotflyover ").appendValue(shouldnotflyover);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _shouldnotflyover = dec.readUnsignedByte();
                    if (!(_shouldnotflyover == shouldnotflyover)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("shouldnotflyover was ").appendValue(_shouldnotflyover);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsBankedTurn(final int value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 10)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)10));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 10)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _value = dec.readUnsignedByte();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsMinAltitude(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 11)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)11));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 11)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsCirclingDirection(final ArsdkFeatureArdrone3.PilotingsettingsCirclingdirectionValue value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readSignedInt() == value.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)12));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _value = dec.readSignedInt();
                    if (!(_value == value.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(ArsdkFeatureArdrone3.PilotingsettingsCirclingdirectionValue.fromValue(_value));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsCirclingRadius(final int value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 13)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)13));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 13)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _value = dec.readUnsignedShort();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsCirclingAltitude(final int value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 14)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)14));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 14)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _value = dec.readUnsignedShort();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsPitchMode(final ArsdkFeatureArdrone3.PilotingsettingsPitchmodeValue value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 15)
                    return false;
                return !checkParams || (dec.readSignedInt() == value.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)15));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 15)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _value = dec.readSignedInt();
                    if (!(_value == value.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(ArsdkFeatureArdrone3.PilotingsettingsPitchmodeValue.fromValue(_value));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PilotingSettingsSetMotionDetectionMode(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 16)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)258,(short)16));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 16)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3AnimationsFlip(final ArsdkFeatureArdrone3.AnimationsFlipDirection direction) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 5 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == direction.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)261,(short)0));
                description.appendText(", direction ").appendValue(direction);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 5 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _direction = dec.readSignedInt();
                    if (!(_direction == direction.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("direction was ").appendValue(ArsdkFeatureArdrone3.AnimationsFlipDirection.fromValue(_direction));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3MediaRecordPicture(final int massStorageId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == massStorageId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)263,(short)0));
                description.appendText(", massStorageId ").appendValue(massStorageId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _massStorageId = dec.readUnsignedByte();
                    if (!(_massStorageId == massStorageId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("massStorageId was ").appendValue(_massStorageId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3MediaRecordVideo(final ArsdkFeatureArdrone3.MediarecordVideoRecord record, final int massStorageId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == record.value) && (dec.readUnsignedByte() == massStorageId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)263,(short)1));
                description.appendText(", record ").appendValue(record);
                description.appendText(", massStorageId ").appendValue(massStorageId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _record = dec.readSignedInt();
                    if (!(_record == record.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("record was ").appendValue(ArsdkFeatureArdrone3.MediarecordVideoRecord.fromValue(_record));
                    }
                    int _massStorageId = dec.readUnsignedByte();
                    if (!(_massStorageId == massStorageId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("massStorageId was ").appendValue(_massStorageId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3MediaRecordPictureV2() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)263,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3MediaRecordVideoV2(final ArsdkFeatureArdrone3.MediarecordVideov2Record record) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readSignedInt() == record.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)263,(short)3));
                description.appendText(", record ").appendValue(record);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _record = dec.readSignedInt();
                    if (!(_record == record.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("record was ").appendValue(ArsdkFeatureArdrone3.MediarecordVideov2Record.fromValue(_record));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3NetworkSettingsWifiSelection(final ArsdkFeatureArdrone3.NetworksettingsWifiselectionType type, final ArsdkFeatureArdrone3.NetworksettingsWifiselectionBand band, final int channel) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value) && (dec.readSignedInt() == band.value) && (dec.readUnsignedByte() == channel);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)265,(short)0));
                description.appendText(", type ").appendValue(type);
                description.appendText(", band ").appendValue(band);
                description.appendText(", channel ").appendValue(channel);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureArdrone3.NetworksettingsWifiselectionType.fromValue(_type));
                    }
                    int _band = dec.readSignedInt();
                    if (!(_band == band.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("band was ").appendValue(ArsdkFeatureArdrone3.NetworksettingsWifiselectionBand.fromValue(_band));
                    }
                    int _channel = dec.readUnsignedByte();
                    if (!(_channel == channel)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("channel was ").appendValue(_channel);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3NetworkSettingsWifiSecurity(final ArsdkFeatureArdrone3.NetworksettingsWifisecurityType type, final String key, final ArsdkFeatureArdrone3.NetworksettingsWifisecurityKeytype keytype) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value) && (dec.readString().equals(key)) && (dec.readSignedInt() == keytype.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)265,(short)1));
                description.appendText(", type ").appendValue(type);
                description.appendText(", key ").appendValue(key);
                description.appendText(", keytype ").appendValue(keytype);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureArdrone3.NetworksettingsWifisecurityType.fromValue(_type));
                    }
                    String _key = dec.readString();
                    if (!(_key.equals(key))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("key was ").appendValue(_key);
                    }
                    int _keytype = dec.readSignedInt();
                    if (!(_keytype == keytype.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("keytype was ").appendValue(ArsdkFeatureArdrone3.NetworksettingsWifisecurityKeytype.fromValue(_keytype));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3SpeedSettingsMaxVerticalSpeed(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)267,(short)0));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3SpeedSettingsMaxRotationSpeed(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)267,(short)1));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3SpeedSettingsHullProtection(final int present) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == present);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)267,(short)2));
                description.appendText(", present ").appendValue(present);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _present = dec.readUnsignedByte();
                    if (!(_present == present)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("present was ").appendValue(_present);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3SpeedSettingsOutdoor(final int outdoor) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == outdoor);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)267,(short)3));
                description.appendText(", outdoor ").appendValue(outdoor);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _outdoor = dec.readUnsignedByte();
                    if (!(_outdoor == outdoor)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("outdoor was ").appendValue(_outdoor);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3SpeedSettingsMaxPitchRollRotationSpeed(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)267,(short)4));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3NetworkWifiScan(final ArsdkFeatureArdrone3.NetworkWifiscanBand band) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == band.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)269,(short)0));
                description.appendText(", band ").appendValue(band);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _band = dec.readSignedInt();
                    if (!(_band == band.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("band was ").appendValue(ArsdkFeatureArdrone3.NetworkWifiscanBand.fromValue(_band));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3NetworkWifiAuthChannel() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)269,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsPictureFormatSelection(final ArsdkFeatureArdrone3.PicturesettingsPictureformatselectionType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)0));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureArdrone3.PicturesettingsPictureformatselectionType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsAutoWhiteBalanceSelection(final ArsdkFeatureArdrone3.PicturesettingsAutowhitebalanceselectionType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)1));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureArdrone3.PicturesettingsAutowhitebalanceselectionType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsExpositionSelection(final float value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readFloat() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)2));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _value = dec.readFloat();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsSaturationSelection(final float value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readFloat() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)3));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _value = dec.readFloat();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsTimelapseSelection(final int enabled, final float interval) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enabled) && (dec.readFloat() == interval);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)4));
                description.appendText(", enabled ").appendValue(enabled);
                description.appendText(", interval ").appendValue(interval);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enabled = dec.readUnsignedByte();
                    if (!(_enabled == enabled)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enabled was ").appendValue(_enabled);
                    }
                    float _interval = dec.readFloat();
                    if (!(_interval == interval)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("interval was ").appendValue(_interval);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsVideoAutorecordSelection(final int enabled, final int massStorageId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enabled) && (dec.readUnsignedByte() == massStorageId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)5));
                description.appendText(", enabled ").appendValue(enabled);
                description.appendText(", massStorageId ").appendValue(massStorageId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enabled = dec.readUnsignedByte();
                    if (!(_enabled == enabled)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enabled was ").appendValue(_enabled);
                    }
                    int _massStorageId = dec.readUnsignedByte();
                    if (!(_massStorageId == massStorageId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("massStorageId was ").appendValue(_massStorageId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsVideoStabilizationMode(final ArsdkFeatureArdrone3.PicturesettingsVideostabilizationmodeMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 6)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)6));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureArdrone3.PicturesettingsVideostabilizationmodeMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsVideoRecordingMode(final ArsdkFeatureArdrone3.PicturesettingsVideorecordingmodeMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 7)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)7));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 7)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureArdrone3.PicturesettingsVideorecordingmodeMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsVideoFramerate(final ArsdkFeatureArdrone3.PicturesettingsVideoframerateFramerate framerate) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 8)
                    return false;
                return !checkParams || (dec.readSignedInt() == framerate.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)8));
                description.appendText(", framerate ").appendValue(framerate);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 8)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _framerate = dec.readSignedInt();
                    if (!(_framerate == framerate.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("framerate was ").appendValue(ArsdkFeatureArdrone3.PicturesettingsVideoframerateFramerate.fromValue(_framerate));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3PictureSettingsVideoResolutions(final ArsdkFeatureArdrone3.PicturesettingsVideoresolutionsType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 9)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)275,(short)9));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 19 || dec.readUnsignedShort() != 9)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureArdrone3.PicturesettingsVideoresolutionsType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3MediaStreamingVideoEnable(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 21 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)277,(short)0));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 21 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3MediaStreamingVideoStreamMode(final ArsdkFeatureArdrone3.MediastreamingVideostreammodeMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 21 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)277,(short)1));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 21 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureArdrone3.MediastreamingVideostreammodeMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3GPSSettingsSetHome(final double latitude, final double longitude, final double altitude) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readDouble() == latitude) && (dec.readDouble() == longitude) && (dec.readDouble() == altitude);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)279,(short)0));
                description.appendText(", latitude ").appendValue(latitude);
                description.appendText(", longitude ").appendValue(longitude);
                description.appendText(", altitude ").appendValue(altitude);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                    double _altitude = dec.readDouble();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3GPSSettingsResetHome() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)279,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3GPSSettingsSendControllerGPS(final double latitude, final double longitude, final double altitude, final double horizontalaccuracy, final double verticalaccuracy) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readDouble() == latitude) && (dec.readDouble() == longitude) && (dec.readDouble() == altitude) && (dec.readDouble() == horizontalaccuracy) && (dec.readDouble() == verticalaccuracy);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)279,(short)2));
                description.appendText(", latitude ").appendValue(latitude);
                description.appendText(", longitude ").appendValue(longitude);
                description.appendText(", altitude ").appendValue(altitude);
                description.appendText(", horizontalaccuracy ").appendValue(horizontalaccuracy);
                description.appendText(", verticalaccuracy ").appendValue(verticalaccuracy);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                    double _altitude = dec.readDouble();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                    double _horizontalaccuracy = dec.readDouble();
                    if (!(_horizontalaccuracy == horizontalaccuracy)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("horizontalaccuracy was ").appendValue(_horizontalaccuracy);
                    }
                    double _verticalaccuracy = dec.readDouble();
                    if (!(_verticalaccuracy == verticalaccuracy)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalaccuracy was ").appendValue(_verticalaccuracy);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3GPSSettingsHomeType(final ArsdkFeatureArdrone3.GpssettingsHometypeType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)279,(short)3));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureArdrone3.GpssettingsHometypeType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3GPSSettingsReturnHomeDelay(final int delay) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == delay);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)279,(short)4));
                description.appendText(", delay ").appendValue(delay);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _delay = dec.readUnsignedShort();
                    if (!(_delay == delay)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("delay was ").appendValue(_delay);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3GPSSettingsReturnHomeMinAltitude(final float value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readFloat() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)279,(short)5));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 23 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _value = dec.readFloat();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3AntiflickeringElectricFrequency(final ArsdkFeatureArdrone3.AntiflickeringElectricfrequencyFrequency frequency) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 29 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == frequency.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)285,(short)0));
                description.appendText(", frequency ").appendValue(frequency);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 29 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _frequency = dec.readSignedInt();
                    if (!(_frequency == frequency.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("frequency was ").appendValue(ArsdkFeatureArdrone3.AntiflickeringElectricfrequencyFrequency.fromValue(_frequency));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3AntiflickeringSetMode(final ArsdkFeatureArdrone3.AntiflickeringSetmodeMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 29 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)285,(short)1));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 29 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureArdrone3.AntiflickeringSetmodeMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd ardrone3SoundStartAlertSound() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 35 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)291,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 35 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ardrone3SoundStopAlertSound() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 35 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)291,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 1 || dec.readUnsignedByte() != 35 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingFlatTrim() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)512,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingTakeOff() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)512,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingPCMD(final int flag, final int roll, final int pitch, final int yaw, final int gaz, final long timestamp) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == flag) && (dec.readSignedByte() == roll) && (dec.readSignedByte() == pitch) && (dec.readSignedByte() == yaw) && (dec.readSignedByte() == gaz) && (dec.readUnsignedInt() == timestamp);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)512,(short)2));
                description.appendText(", flag ").appendValue(flag);
                description.appendText(", roll ").appendValue(roll);
                description.appendText(", pitch ").appendValue(pitch);
                description.appendText(", yaw ").appendValue(yaw);
                description.appendText(", gaz ").appendValue(gaz);
                description.appendText(", timestamp ").appendValue(timestamp);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _flag = dec.readUnsignedByte();
                    if (!(_flag == flag)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("flag was ").appendValue(_flag);
                    }
                    int _roll = dec.readSignedByte();
                    if (!(_roll == roll)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("roll was ").appendValue(_roll);
                    }
                    int _pitch = dec.readSignedByte();
                    if (!(_pitch == pitch)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pitch was ").appendValue(_pitch);
                    }
                    int _yaw = dec.readSignedByte();
                    if (!(_yaw == yaw)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("yaw was ").appendValue(_yaw);
                    }
                    int _gaz = dec.readSignedByte();
                    if (!(_gaz == gaz)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gaz was ").appendValue(_gaz);
                    }
                    long _timestamp = dec.readUnsignedInt();
                    if (!(_timestamp == timestamp)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("timestamp was ").appendValue(_timestamp);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingLanding() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)512,(short)3));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingEmergency() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)512,(short)4));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingAutoTakeOffMode(final int state) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == state);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)512,(short)5));
                description.appendText(", state ").appendValue(state);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _state = dec.readUnsignedByte();
                    if (!(_state == state)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("state was ").appendValue(_state);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingFlyingMode(final ArsdkFeatureMinidrone.PilotingFlyingmodeMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)512,(short)6));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureMinidrone.PilotingFlyingmodeMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingPlaneGearBox(final ArsdkFeatureMinidrone.PilotingPlanegearboxState state) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    return false;
                return !checkParams || (dec.readSignedInt() == state.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)512,(short)7));
                description.appendText(", state ").appendValue(state);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _state = dec.readSignedInt();
                    if (!(_state == state.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("state was ").appendValue(ArsdkFeatureMinidrone.PilotingPlanegearboxState.fromValue(_state));
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingTogglePilotingMode() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)512,(short)8));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd minidroneSpeedSettingsMaxVerticalSpeed(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)513,(short)0));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneSpeedSettingsMaxRotationSpeed(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)513,(short)1));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneSpeedSettingsWheels(final int present) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == present);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)513,(short)2));
                description.appendText(", present ").appendValue(present);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _present = dec.readUnsignedByte();
                    if (!(_present == present)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("present was ").appendValue(_present);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneSpeedSettingsMaxHorizontalSpeed(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)513,(short)3));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneSpeedSettingsMaxPlaneModeRotationSpeed(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)513,(short)4));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneAnimationsFlip(final ArsdkFeatureMinidrone.AnimationsFlipDirection direction) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == direction.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)516,(short)0));
                description.appendText(", direction ").appendValue(direction);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _direction = dec.readSignedInt();
                    if (!(_direction == direction.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("direction was ").appendValue(ArsdkFeatureMinidrone.AnimationsFlipDirection.fromValue(_direction));
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneAnimationsCap(final int offset) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedShort() == offset);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)516,(short)1));
                description.appendText(", offset ").appendValue(offset);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _offset = dec.readSignedShort();
                    if (!(_offset == offset)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("offset was ").appendValue(_offset);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneMediaRecordPicture(final int massStorageId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == massStorageId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)518,(short)0));
                description.appendText(", massStorageId ").appendValue(massStorageId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _massStorageId = dec.readUnsignedByte();
                    if (!(_massStorageId == massStorageId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("massStorageId was ").appendValue(_massStorageId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneMediaRecordPictureV2() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)518,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingSettingsMaxAltitude(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)520,(short)0));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingSettingsMaxTilt(final float current) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readFloat() == current);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)520,(short)1));
                description.appendText(", current ").appendValue(current);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _current = dec.readFloat();
                    if (!(_current == current)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("current was ").appendValue(_current);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingSettingsBankedTurn(final int value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)520,(short)2));
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _value = dec.readUnsignedByte();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingSettingsMaxThrottle(final float max) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readFloat() == max);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)520,(short)3));
                description.appendText(", max ").appendValue(max);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _max = dec.readFloat();
                    if (!(_max == max)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("max was ").appendValue(_max);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidronePilotingSettingsPreferredPilotingMode(final ArsdkFeatureMinidrone.PilotingsettingsPreferredpilotingmodeMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)520,(short)4));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureMinidrone.PilotingsettingsPreferredpilotingmodeMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneSettingsCutOutMode(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 10 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)522,(short)0));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 10 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneGPSControllerLatitudeForRun(final double latitude) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readDouble() == latitude);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)525,(short)0));
                description.appendText(", latitude ").appendValue(latitude);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneGPSControllerLongitudeForRun(final double longitude) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readDouble() == longitude);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)525,(short)1));
                description.appendText(", longitude ").appendValue(longitude);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneConfigurationControllerType(final String type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readString().equals(type));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)526,(short)0));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _type = dec.readString();
                    if (!(_type.equals(type))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(_type);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneConfigurationControllerName(final String name) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readString().equals(name));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)526,(short)1));
                description.appendText(", name ").appendValue(name);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _name = dec.readString();
                    if (!(_name.equals(name))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("name was ").appendValue(_name);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneUsbAccessoryLightControl(final int id, final ArsdkFeatureMinidrone.UsbaccessoryLightcontrolMode mode, final int intensity) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == id) && (dec.readSignedInt() == mode.value) && (dec.readUnsignedByte() == intensity);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)528,(short)0));
                description.appendText(", id ").appendValue(id);
                description.appendText(", mode ").appendValue(mode);
                description.appendText(", intensity ").appendValue(intensity);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedByte();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureMinidrone.UsbaccessoryLightcontrolMode.fromValue(_mode));
                    }
                    int _intensity = dec.readUnsignedByte();
                    if (!(_intensity == intensity)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("intensity was ").appendValue(_intensity);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneUsbAccessoryClawControl(final int id, final ArsdkFeatureMinidrone.UsbaccessoryClawcontrolAction action) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == id) && (dec.readSignedInt() == action.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)528,(short)1));
                description.appendText(", id ").appendValue(id);
                description.appendText(", action ").appendValue(action);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedByte();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                    int _action = dec.readSignedInt();
                    if (!(_action == action.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("action was ").appendValue(ArsdkFeatureMinidrone.UsbaccessoryClawcontrolAction.fromValue(_action));
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneUsbAccessoryGunControl(final int id, final ArsdkFeatureMinidrone.UsbaccessoryGuncontrolAction action) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == id) && (dec.readSignedInt() == action.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)528,(short)2));
                description.appendText(", id ").appendValue(id);
                description.appendText(", action ").appendValue(action);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedByte();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                    int _action = dec.readSignedInt();
                    if (!(_action == action.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("action was ").appendValue(ArsdkFeatureMinidrone.UsbaccessoryGuncontrolAction.fromValue(_action));
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneRemoteControllerSetPairedRemote(final int msbMac, final int midMac, final int lsbMac) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 17 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == msbMac) && (dec.readUnsignedShort() == midMac) && (dec.readUnsignedShort() == lsbMac);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)529,(short)0));
                description.appendText(", msbMac ").appendValue(msbMac);
                description.appendText(", midMac ").appendValue(midMac);
                description.appendText(", lsbMac ").appendValue(lsbMac);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 17 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _msbMac = dec.readUnsignedShort();
                    if (!(_msbMac == msbMac)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("msbMac was ").appendValue(_msbMac);
                    }
                    int _midMac = dec.readUnsignedShort();
                    if (!(_midMac == midMac)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("midMac was ").appendValue(_midMac);
                    }
                    int _lsbMac = dec.readUnsignedShort();
                    if (!(_lsbMac == lsbMac)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("lsbMac was ").appendValue(_lsbMac);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneRemoteControllerRawMode(final int enabled) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 17 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enabled);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)529,(short)1));
                description.appendText(", enabled ").appendValue(enabled);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 17 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enabled = dec.readUnsignedByte();
                    if (!(_enabled == enabled)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enabled was ").appendValue(_enabled);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneVideoSettingsAutorecord(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)532,(short)0));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneVideoSettingsElectricFrequency(final ArsdkFeatureMinidrone.VideosettingsElectricfrequencyFrequency frequency) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == frequency.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)532,(short)1));
                description.appendText(", frequency ").appendValue(frequency);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _frequency = dec.readSignedInt();
                    if (!(_frequency == frequency.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("frequency was ").appendValue(ArsdkFeatureMinidrone.VideosettingsElectricfrequencyFrequency.fromValue(_frequency));
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneVideoSettingsVideoResolution(final ArsdkFeatureMinidrone.VideosettingsVideoresolutionType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)532,(short)2));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureMinidrone.VideosettingsVideoresolutionType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneMinicamPicture() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)536,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd minidroneMinicamVideo(final ArsdkFeatureMinidrone.MinicamVideoRecord record) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == record.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)536,(short)1));
                description.appendText(", record ").appendValue(record);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _record = dec.readSignedInt();
                    if (!(_record == record.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("record was ").appendValue(ArsdkFeatureMinidrone.MinicamVideoRecord.fromValue(_record));
                    }
                }
            }
        };
    }

    public static ExpectedCmd minidroneMinicamMassStorageFormat() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)536,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 2 || dec.readUnsignedByte() != 24 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd jpsumoPilotingPCMD(final int flag, final int speed, final int turn) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == flag) && (dec.readSignedByte() == speed) && (dec.readSignedByte() == turn);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)768,(short)0));
                description.appendText(", flag ").appendValue(flag);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", turn ").appendValue(turn);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _flag = dec.readUnsignedByte();
                    if (!(_flag == flag)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("flag was ").appendValue(_flag);
                    }
                    int _speed = dec.readSignedByte();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    int _turn = dec.readSignedByte();
                    if (!(_turn == turn)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("turn was ").appendValue(_turn);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoPilotingPosture(final ArsdkFeatureJpsumo.PilotingPostureType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)768,(short)1));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureJpsumo.PilotingPostureType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoPilotingAddCapOffset(final float offset) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readFloat() == offset);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)768,(short)2));
                description.appendText(", offset ").appendValue(offset);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _offset = dec.readFloat();
                    if (!(_offset == offset)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("offset was ").appendValue(_offset);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoAnimationsJumpStop() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)770,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd jpsumoAnimationsJumpCancel() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)770,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd jpsumoAnimationsJumpLoad() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)770,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd jpsumoAnimationsJump(final ArsdkFeatureJpsumo.AnimationsJumpType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)770,(short)3));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureJpsumo.AnimationsJumpType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoAnimationsSimpleAnimation(final ArsdkFeatureJpsumo.AnimationsSimpleanimationId id) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readSignedInt() == id.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)770,(short)4));
                description.appendText(", id ").appendValue(id);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readSignedInt();
                    if (!(_id == id.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(ArsdkFeatureJpsumo.AnimationsSimpleanimationId.fromValue(_id));
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoMediaRecordPicture(final int massStorageId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == massStorageId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)774,(short)0));
                description.appendText(", massStorageId ").appendValue(massStorageId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _massStorageId = dec.readUnsignedByte();
                    if (!(_massStorageId == massStorageId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("massStorageId was ").appendValue(_massStorageId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoMediaRecordVideo(final ArsdkFeatureJpsumo.MediarecordVideoRecord record, final int massStorageId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == record.value) && (dec.readUnsignedByte() == massStorageId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)774,(short)1));
                description.appendText(", record ").appendValue(record);
                description.appendText(", massStorageId ").appendValue(massStorageId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _record = dec.readSignedInt();
                    if (!(_record == record.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("record was ").appendValue(ArsdkFeatureJpsumo.MediarecordVideoRecord.fromValue(_record));
                    }
                    int _massStorageId = dec.readUnsignedByte();
                    if (!(_massStorageId == massStorageId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("massStorageId was ").appendValue(_massStorageId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoMediaRecordPictureV2() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)774,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd jpsumoMediaRecordVideoV2(final ArsdkFeatureJpsumo.MediarecordVideov2Record record) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readSignedInt() == record.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)774,(short)3));
                description.appendText(", record ").appendValue(record);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _record = dec.readSignedInt();
                    if (!(_record == record.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("record was ").appendValue(ArsdkFeatureJpsumo.MediarecordVideov2Record.fromValue(_record));
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoNetworkSettingsWifiSelection(final ArsdkFeatureJpsumo.NetworksettingsWifiselectionType type, final ArsdkFeatureJpsumo.NetworksettingsWifiselectionBand band, final int channel) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value) && (dec.readSignedInt() == band.value) && (dec.readUnsignedByte() == channel);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)776,(short)0));
                description.appendText(", type ").appendValue(type);
                description.appendText(", band ").appendValue(band);
                description.appendText(", channel ").appendValue(channel);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 8 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureJpsumo.NetworksettingsWifiselectionType.fromValue(_type));
                    }
                    int _band = dec.readSignedInt();
                    if (!(_band == band.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("band was ").appendValue(ArsdkFeatureJpsumo.NetworksettingsWifiselectionBand.fromValue(_band));
                    }
                    int _channel = dec.readUnsignedByte();
                    if (!(_channel == channel)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("channel was ").appendValue(_channel);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoNetworkWifiScan(final ArsdkFeatureJpsumo.NetworkWifiscanBand band) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 10 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == band.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)778,(short)0));
                description.appendText(", band ").appendValue(band);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 10 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _band = dec.readSignedInt();
                    if (!(_band == band.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("band was ").appendValue(ArsdkFeatureJpsumo.NetworkWifiscanBand.fromValue(_band));
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoNetworkWifiAuthChannel() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 10 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)778,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 10 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd jpsumoAudioSettingsMasterVolume(final int volume) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == volume);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)780,(short)0));
                description.appendText(", volume ").appendValue(volume);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _volume = dec.readUnsignedByte();
                    if (!(_volume == volume)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("volume was ").appendValue(_volume);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoAudioSettingsTheme(final ArsdkFeatureJpsumo.AudiosettingsThemeTheme theme) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == theme.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)780,(short)1));
                description.appendText(", theme ").appendValue(theme);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _theme = dec.readSignedInt();
                    if (!(_theme == theme.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("theme was ").appendValue(ArsdkFeatureJpsumo.AudiosettingsThemeTheme.fromValue(_theme));
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoRoadPlanAllScriptsMetadata() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)782,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd jpsumoRoadPlanScriptUploaded(final String uuid, final String md5hash) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readString().equals(uuid)) && (dec.readString().equals(md5hash));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)782,(short)1));
                description.appendText(", uuid ").appendValue(uuid);
                description.appendText(", md5hash ").appendValue(md5hash);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _uuid = dec.readString();
                    if (!(_uuid.equals(uuid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("uuid was ").appendValue(_uuid);
                    }
                    String _md5hash = dec.readString();
                    if (!(_md5hash.equals(md5hash))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("md5hash was ").appendValue(_md5hash);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoRoadPlanScriptDelete(final String uuid) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readString().equals(uuid));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)782,(short)2));
                description.appendText(", uuid ").appendValue(uuid);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _uuid = dec.readString();
                    if (!(_uuid.equals(uuid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("uuid was ").appendValue(_uuid);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoRoadPlanPlayScript(final String uuid) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readString().equals(uuid));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)782,(short)3));
                description.appendText(", uuid ").appendValue(uuid);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _uuid = dec.readString();
                    if (!(_uuid.equals(uuid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("uuid was ").appendValue(_uuid);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoSpeedSettingsOutdoor(final int outdoor) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == outdoor);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)784,(short)0));
                description.appendText(", outdoor ").appendValue(outdoor);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _outdoor = dec.readUnsignedByte();
                    if (!(_outdoor == outdoor)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("outdoor was ").appendValue(_outdoor);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoMediaStreamingVideoEnable(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 18 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)786,(short)0));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 18 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd jpsumoVideoSettingsAutorecord(final int enabled) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 21 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enabled);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)789,(short)0));
                description.appendText(", enabled ").appendValue(enabled);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 3 || dec.readUnsignedByte() != 21 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enabled = dec.readUnsignedByte();
                    if (!(_enabled == enabled)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enabled was ").appendValue(_enabled);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlWifiRequestWifiList() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1025,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlWifiRequestCurrentWifi() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1025,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlWifiConnectToWifi(final String bssid, final String ssid, final String passphrase) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readString().equals(bssid)) && (dec.readString().equals(ssid)) && (dec.readString().equals(passphrase));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1025,(short)2));
                description.appendText(", bssid ").appendValue(bssid);
                description.appendText(", ssid ").appendValue(ssid);
                description.appendText(", passphrase ").appendValue(passphrase);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _bssid = dec.readString();
                    if (!(_bssid.equals(bssid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("bssid was ").appendValue(_bssid);
                    }
                    String _ssid = dec.readString();
                    if (!(_ssid.equals(ssid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("ssid was ").appendValue(_ssid);
                    }
                    String _passphrase = dec.readString();
                    if (!(_passphrase.equals(passphrase))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("passphrase was ").appendValue(_passphrase);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlWifiForgetWifi(final String ssid) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readString().equals(ssid));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1025,(short)3));
                description.appendText(", ssid ").appendValue(ssid);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _ssid = dec.readString();
                    if (!(_ssid.equals(ssid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("ssid was ").appendValue(_ssid);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlWifiWifiAuthChannel() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 4)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1025,(short)4));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 1 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlDeviceRequestDeviceList() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1026,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlDeviceRequestCurrentDevice() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1026,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlDeviceConnectToDevice(final String devicename) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readString().equals(devicename));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1026,(short)2));
                description.appendText(", devicename ").appendValue(devicename);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _devicename = dec.readString();
                    if (!(_devicename.equals(devicename))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("devicename was ").appendValue(_devicename);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlSettingsAllSettings() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1028,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlSettingsReset() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1028,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlCommonAllStates() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1030,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlCommonCurrentDateTime(final String datetime) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readString().equals(datetime));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1030,(short)1));
                description.appendText(", datetime ").appendValue(datetime);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 6 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _datetime = dec.readString();
                    if (!(_datetime.equals(datetime))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("datetime was ").appendValue(_datetime);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAccessPointSettingsAccessPointSSID(final String ssid) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readString().equals(ssid));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1033,(short)0));
                description.appendText(", ssid ").appendValue(ssid);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _ssid = dec.readString();
                    if (!(_ssid.equals(ssid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("ssid was ").appendValue(_ssid);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAccessPointSettingsAccessPointChannel(final int channel) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == channel);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1033,(short)1));
                description.appendText(", channel ").appendValue(channel);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _channel = dec.readUnsignedByte();
                    if (!(_channel == channel)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("channel was ").appendValue(_channel);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAccessPointSettingsWifiSelection(final ArsdkFeatureSkyctrl.AccesspointsettingsWifiselectionType type, final ArsdkFeatureSkyctrl.AccesspointsettingsWifiselectionBand band, final int channel) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value) && (dec.readSignedInt() == band.value) && (dec.readUnsignedByte() == channel);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1033,(short)2));
                description.appendText(", type ").appendValue(type);
                description.appendText(", band ").appendValue(band);
                description.appendText(", channel ").appendValue(channel);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureSkyctrl.AccesspointsettingsWifiselectionType.fromValue(_type));
                    }
                    int _band = dec.readSignedInt();
                    if (!(_band == band.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("band was ").appendValue(ArsdkFeatureSkyctrl.AccesspointsettingsWifiselectionBand.fromValue(_band));
                    }
                    int _channel = dec.readUnsignedByte();
                    if (!(_channel == channel)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("channel was ").appendValue(_channel);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAccessPointSettingsWifiSecurity(final ArsdkFeatureSkyctrl.AccesspointsettingsWifisecuritySecurityType securityType, final String key) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readSignedInt() == securityType.value) && (dec.readString().equals(key));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1033,(short)3));
                description.appendText(", securityType ").appendValue(securityType);
                description.appendText(", key ").appendValue(key);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _securityType = dec.readSignedInt();
                    if (!(_securityType == securityType.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("securityType was ").appendValue(ArsdkFeatureSkyctrl.AccesspointsettingsWifisecuritySecurityType.fromValue(_securityType));
                    }
                    String _key = dec.readString();
                    if (!(_key.equals(key))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("key was ").appendValue(_key);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlCameraResetOrientation() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1035,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlButtonMappingsGetCurrentButtonMappings() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1036,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlButtonMappingsGetAvailableButtonMappings() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1036,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlButtonMappingsSetButtonMapping(final int keyId, final String mappingUid) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readSignedInt() == keyId) && (dec.readString().equals(mappingUid));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1036,(short)2));
                description.appendText(", keyId ").appendValue(keyId);
                description.appendText(", mappingUid ").appendValue(mappingUid);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _keyId = dec.readSignedInt();
                    if (!(_keyId == keyId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("keyId was ").appendValue(_keyId);
                    }
                    String _mappingUid = dec.readString();
                    if (!(_mappingUid.equals(mappingUid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mappingUid was ").appendValue(_mappingUid);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlButtonMappingsDefaultButtonMapping() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 3)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1036,(short)3));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 12 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAxisMappingsGetCurrentAxisMappings() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1038,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAxisMappingsGetAvailableAxisMappings() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1038,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAxisMappingsSetAxisMapping(final int axisId, final String mappingUid) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readSignedInt() == axisId) && (dec.readString().equals(mappingUid));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1038,(short)2));
                description.appendText(", axisId ").appendValue(axisId);
                description.appendText(", mappingUid ").appendValue(mappingUid);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _axisId = dec.readSignedInt();
                    if (!(_axisId == axisId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("axisId was ").appendValue(_axisId);
                    }
                    String _mappingUid = dec.readString();
                    if (!(_mappingUid.equals(mappingUid))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mappingUid was ").appendValue(_mappingUid);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAxisMappingsDefaultAxisMapping() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 3)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1038,(short)3));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 14 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAxisFiltersGetCurrentAxisFilters() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1040,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAxisFiltersGetPresetAxisFilters() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1040,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAxisFiltersSetAxisFilter(final int axisId, final String filterUidOrBuilder) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readSignedInt() == axisId) && (dec.readString().equals(filterUidOrBuilder));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1040,(short)2));
                description.appendText(", axisId ").appendValue(axisId);
                description.appendText(", filterUidOrBuilder ").appendValue(filterUidOrBuilder);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _axisId = dec.readSignedInt();
                    if (!(_axisId == axisId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("axisId was ").appendValue(_axisId);
                    }
                    String _filterUidOrBuilder = dec.readString();
                    if (!(_filterUidOrBuilder.equals(filterUidOrBuilder))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("filterUidOrBuilder was ").appendValue(_filterUidOrBuilder);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlAxisFiltersDefaultAxisFilters() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 3)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1040,(short)3));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 16 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlGamepadInfosGetGamepadControls() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 18 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1042,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 18 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlCoPilotingSetPilotingSource(final ArsdkFeatureSkyctrl.CopilotingSetpilotingsourceSource source) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == source.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1044,(short)0));
                description.appendText(", source ").appendValue(source);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 20 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _source = dec.readSignedInt();
                    if (!(_source == source.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("source was ").appendValue(ArsdkFeatureSkyctrl.CopilotingSetpilotingsourceSource.fromValue(_source));
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlCalibrationEnableMagnetoCalibrationQualityUpdates(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 22 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1046,(short)0));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 22 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd skyctrlCalibrationStartCalibration() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 22 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1046,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 22 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlCalibrationAbortCalibration() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 22 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1046,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 22 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd skyctrlFactoryReset() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 25 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)1049,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 4 || dec.readUnsignedByte() != 25 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd powerupPilotingPCMD(final int flag, final int throttle, final int roll) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == flag) && (dec.readUnsignedByte() == throttle) && (dec.readSignedByte() == roll);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2048,(short)0));
                description.appendText(", flag ").appendValue(flag);
                description.appendText(", throttle ").appendValue(throttle);
                description.appendText(", roll ").appendValue(roll);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _flag = dec.readUnsignedByte();
                    if (!(_flag == flag)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("flag was ").appendValue(_flag);
                    }
                    int _throttle = dec.readUnsignedByte();
                    if (!(_throttle == throttle)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("throttle was ").appendValue(_throttle);
                    }
                    int _roll = dec.readSignedByte();
                    if (!(_roll == roll)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("roll was ").appendValue(_roll);
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupPilotingUserTakeOff(final int state) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == state);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2048,(short)1));
                description.appendText(", state ").appendValue(state);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _state = dec.readUnsignedByte();
                    if (!(_state == state)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("state was ").appendValue(_state);
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupPilotingMotorMode(final ArsdkFeaturePowerup.PilotingMotormodeMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2048,(short)2));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeaturePowerup.PilotingMotormodeMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupPilotingSettingsSet(final ArsdkFeaturePowerup.PilotingsettingsSetSetting setting, final float value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == setting.value) && (dec.readFloat() == value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2050,(short)0));
                description.appendText(", setting ").appendValue(setting);
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 2 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _setting = dec.readSignedInt();
                    if (!(_setting == setting.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("setting was ").appendValue(ArsdkFeaturePowerup.PilotingsettingsSetSetting.fromValue(_setting));
                    }
                    float _value = dec.readFloat();
                    if (!(_value == value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupMediaRecordPictureV2() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2052,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd powerupMediaRecordVideoV2(final ArsdkFeaturePowerup.MediarecordVideov2Record record) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == record.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2052,(short)1));
                description.appendText(", record ").appendValue(record);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 4 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _record = dec.readSignedInt();
                    if (!(_record == record.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("record was ").appendValue(ArsdkFeaturePowerup.MediarecordVideov2Record.fromValue(_record));
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupNetworkSettingsWifiSelection(final ArsdkFeaturePowerup.NetworksettingsWifiselectionType type, final ArsdkFeaturePowerup.NetworksettingsWifiselectionBand band, final int channel) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value) && (dec.readSignedInt() == band.value) && (dec.readUnsignedByte() == channel);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2055,(short)0));
                description.appendText(", type ").appendValue(type);
                description.appendText(", band ").appendValue(band);
                description.appendText(", channel ").appendValue(channel);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 7 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeaturePowerup.NetworksettingsWifiselectionType.fromValue(_type));
                    }
                    int _band = dec.readSignedInt();
                    if (!(_band == band.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("band was ").appendValue(ArsdkFeaturePowerup.NetworksettingsWifiselectionBand.fromValue(_band));
                    }
                    int _channel = dec.readUnsignedByte();
                    if (!(_channel == channel)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("channel was ").appendValue(_channel);
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupNetworkWifiScan(final ArsdkFeaturePowerup.NetworkWifiscanBand band) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readSignedInt() == band.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2057,(short)0));
                description.appendText(", band ").appendValue(band);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _band = dec.readSignedInt();
                    if (!(_band == band.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("band was ").appendValue(ArsdkFeaturePowerup.NetworkWifiscanBand.fromValue(_band));
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupNetworkWifiAuthChannel() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2057,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 9 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd powerupMediaStreamingVideoEnable(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2059,(short)0));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 11 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupVideoSettingsAutorecord(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2061,(short)0));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupVideoSettingsVideoMode(final ArsdkFeaturePowerup.VideosettingsVideomodeMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2061,(short)1));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 13 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeaturePowerup.VideosettingsVideomodeMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd powerupSoundsBuzz(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 15 || dec.readUnsignedShort() != 0)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)2063,(short)0));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 8 || dec.readUnsignedByte() != 15 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd genericDefault() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 133 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34048,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 133 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd followMeStart(final ArsdkFeatureFollowMe.Mode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)1));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureFollowMe.Mode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeStop() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd followMeConfigureGeographic(final int useDefaultBitField, final float distance, final float elevation, final float azimuth) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == useDefaultBitField) && (dec.readFloat() == distance) && (dec.readFloat() == elevation) && (dec.readFloat() == azimuth);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)6));
                description.appendText(", useDefaultBitField ").appendValue(useDefaultBitField);
                description.appendText(", distance ").appendValue(distance);
                description.appendText(", elevation ").appendValue(elevation);
                description.appendText(", azimuth ").appendValue(azimuth);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _useDefaultBitField = dec.readUnsignedByte();
                    if (!(_useDefaultBitField == useDefaultBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("useDefaultBitField was ").appendValue(_useDefaultBitField);
                    }
                    float _distance = dec.readFloat();
                    if (!(_distance == distance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("distance was ").appendValue(_distance);
                    }
                    float _elevation = dec.readFloat();
                    if (!(_elevation == elevation)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("elevation was ").appendValue(_elevation);
                    }
                    float _azimuth = dec.readFloat();
                    if (!(_azimuth == azimuth)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("azimuth was ").appendValue(_azimuth);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeConfigureRelative(final int useDefaultBitField, final float distance, final float elevation, final float azimuth) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == useDefaultBitField) && (dec.readFloat() == distance) && (dec.readFloat() == elevation) && (dec.readFloat() == azimuth);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)8));
                description.appendText(", useDefaultBitField ").appendValue(useDefaultBitField);
                description.appendText(", distance ").appendValue(distance);
                description.appendText(", elevation ").appendValue(elevation);
                description.appendText(", azimuth ").appendValue(azimuth);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _useDefaultBitField = dec.readUnsignedByte();
                    if (!(_useDefaultBitField == useDefaultBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("useDefaultBitField was ").appendValue(_useDefaultBitField);
                    }
                    float _distance = dec.readFloat();
                    if (!(_distance == distance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("distance was ").appendValue(_distance);
                    }
                    float _elevation = dec.readFloat();
                    if (!(_elevation == elevation)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("elevation was ").appendValue(_elevation);
                    }
                    float _azimuth = dec.readFloat();
                    if (!(_azimuth == azimuth)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("azimuth was ").appendValue(_azimuth);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeStopAnimation() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)11));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd followMeStartHelicoidAnim(final int useDefaultBitField, final float speed, final float revolutionNumber, final float verticalDistance) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == useDefaultBitField) && (dec.readFloat() == speed) && (dec.readFloat() == revolutionNumber) && (dec.readFloat() == verticalDistance);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)12));
                description.appendText(", useDefaultBitField ").appendValue(useDefaultBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", revolutionNumber ").appendValue(revolutionNumber);
                description.appendText(", verticalDistance ").appendValue(verticalDistance);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _useDefaultBitField = dec.readUnsignedByte();
                    if (!(_useDefaultBitField == useDefaultBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("useDefaultBitField was ").appendValue(_useDefaultBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _revolutionNumber = dec.readFloat();
                    if (!(_revolutionNumber == revolutionNumber)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("revolutionNumber was ").appendValue(_revolutionNumber);
                    }
                    float _verticalDistance = dec.readFloat();
                    if (!(_verticalDistance == verticalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalDistance was ").appendValue(_verticalDistance);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeStartSwingAnim(final int useDefaultBitField, final float speed, final float verticalDistance) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == useDefaultBitField) && (dec.readFloat() == speed) && (dec.readFloat() == verticalDistance);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)14));
                description.appendText(", useDefaultBitField ").appendValue(useDefaultBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", verticalDistance ").appendValue(verticalDistance);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _useDefaultBitField = dec.readUnsignedByte();
                    if (!(_useDefaultBitField == useDefaultBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("useDefaultBitField was ").appendValue(_useDefaultBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _verticalDistance = dec.readFloat();
                    if (!(_verticalDistance == verticalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalDistance was ").appendValue(_verticalDistance);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeStartBoomerangAnim(final int useDefaultBitField, final float speed, final float distance) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == useDefaultBitField) && (dec.readFloat() == speed) && (dec.readFloat() == distance);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)16));
                description.appendText(", useDefaultBitField ").appendValue(useDefaultBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", distance ").appendValue(distance);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _useDefaultBitField = dec.readUnsignedByte();
                    if (!(_useDefaultBitField == useDefaultBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("useDefaultBitField was ").appendValue(_useDefaultBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _distance = dec.readFloat();
                    if (!(_distance == distance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("distance was ").appendValue(_distance);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeStartCandleAnim(final int useDefaultBitField, final float speed, final float verticalDistance) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == useDefaultBitField) && (dec.readFloat() == speed) && (dec.readFloat() == verticalDistance);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)18));
                description.appendText(", useDefaultBitField ").appendValue(useDefaultBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", verticalDistance ").appendValue(verticalDistance);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _useDefaultBitField = dec.readUnsignedByte();
                    if (!(_useDefaultBitField == useDefaultBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("useDefaultBitField was ").appendValue(_useDefaultBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _verticalDistance = dec.readFloat();
                    if (!(_verticalDistance == verticalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalDistance was ").appendValue(_verticalDistance);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeStartDollySlideAnim(final int useDefaultBitField, final float speed, final float angle, final float horizontalDistance) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 20)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == useDefaultBitField) && (dec.readFloat() == speed) && (dec.readFloat() == angle) && (dec.readFloat() == horizontalDistance);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)20));
                description.appendText(", useDefaultBitField ").appendValue(useDefaultBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", angle ").appendValue(angle);
                description.appendText(", horizontalDistance ").appendValue(horizontalDistance);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 20)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _useDefaultBitField = dec.readUnsignedByte();
                    if (!(_useDefaultBitField == useDefaultBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("useDefaultBitField was ").appendValue(_useDefaultBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _angle = dec.readFloat();
                    if (!(_angle == angle)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("angle was ").appendValue(_angle);
                    }
                    float _horizontalDistance = dec.readFloat();
                    if (!(_horizontalDistance == horizontalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("horizontalDistance was ").appendValue(_horizontalDistance);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeTargetFramingPosition(final int horizontal, final int vertical) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 22)
                    return false;
                return !checkParams || (dec.readSignedByte() == horizontal) && (dec.readSignedByte() == vertical);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)22));
                description.appendText(", horizontal ").appendValue(horizontal);
                description.appendText(", vertical ").appendValue(vertical);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 22)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _horizontal = dec.readSignedByte();
                    if (!(_horizontal == horizontal)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("horizontal was ").appendValue(_horizontal);
                    }
                    int _vertical = dec.readSignedByte();
                    if (!(_vertical == vertical)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("vertical was ").appendValue(_vertical);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeTargetImageDetection(final float targetAzimuth, final float targetElevation, final float changeOfScale, final int confidenceIndex, final int isNewSelection, final long timestamp) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 24)
                    return false;
                return !checkParams || (dec.readFloat() == targetAzimuth) && (dec.readFloat() == targetElevation) && (dec.readFloat() == changeOfScale) && (dec.readUnsignedByte() == confidenceIndex) && (dec.readUnsignedByte() == isNewSelection) && (dec.readUnsignedLong() == timestamp);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)24));
                description.appendText(", targetAzimuth ").appendValue(targetAzimuth);
                description.appendText(", targetElevation ").appendValue(targetElevation);
                description.appendText(", changeOfScale ").appendValue(changeOfScale);
                description.appendText(", confidenceIndex ").appendValue(confidenceIndex);
                description.appendText(", isNewSelection ").appendValue(isNewSelection);
                description.appendText(", timestamp ").appendValue(timestamp);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 24)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _targetAzimuth = dec.readFloat();
                    if (!(_targetAzimuth == targetAzimuth)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("targetAzimuth was ").appendValue(_targetAzimuth);
                    }
                    float _targetElevation = dec.readFloat();
                    if (!(_targetElevation == targetElevation)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("targetElevation was ").appendValue(_targetElevation);
                    }
                    float _changeOfScale = dec.readFloat();
                    if (!(_changeOfScale == changeOfScale)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("changeOfScale was ").appendValue(_changeOfScale);
                    }
                    int _confidenceIndex = dec.readUnsignedByte();
                    if (!(_confidenceIndex == confidenceIndex)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("confidenceIndex was ").appendValue(_confidenceIndex);
                    }
                    int _isNewSelection = dec.readUnsignedByte();
                    if (!(_isNewSelection == isNewSelection)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("isNewSelection was ").appendValue(_isNewSelection);
                    }
                    long _timestamp = dec.readUnsignedLong();
                    if (!(_timestamp == timestamp)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("timestamp was ").appendValue(_timestamp);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeSetTargetIsController(final int targetIsController) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 26)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == targetIsController);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)26));
                description.appendText(", targetIsController ").appendValue(targetIsController);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 26)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _targetIsController = dec.readUnsignedByte();
                    if (!(_targetIsController == targetIsController)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("targetIsController was ").appendValue(_targetIsController);
                    }
                }
            }
        };
    }

    public static ExpectedCmd followMeConfigureLeash(final int useDefaultBitField, final float distance, final float elevation, final float azimuth) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 28)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == useDefaultBitField) && (dec.readFloat() == distance) && (dec.readFloat() == elevation) && (dec.readFloat() == azimuth);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34304,(short)28));
                description.appendText(", useDefaultBitField ").appendValue(useDefaultBitField);
                description.appendText(", distance ").appendValue(distance);
                description.appendText(", elevation ").appendValue(elevation);
                description.appendText(", azimuth ").appendValue(azimuth);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 134 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 28)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _useDefaultBitField = dec.readUnsignedByte();
                    if (!(_useDefaultBitField == useDefaultBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("useDefaultBitField was ").appendValue(_useDefaultBitField);
                    }
                    float _distance = dec.readFloat();
                    if (!(_distance == distance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("distance was ").appendValue(_distance);
                    }
                    float _elevation = dec.readFloat();
                    if (!(_elevation == elevation)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("elevation was ").appendValue(_elevation);
                    }
                    float _azimuth = dec.readFloat();
                    if (!(_azimuth == azimuth)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("azimuth was ").appendValue(_azimuth);
                    }
                }
            }
        };
    }

    public static ExpectedCmd wifiScan(final int bandBitField) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == bandBitField);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34560,(short)1));
                description.appendText(", bandBitField ").appendValue(bandBitField);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _bandBitField = dec.readUnsignedByte();
                    if (!(_bandBitField == bandBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("bandBitField was ").appendValue(_bandBitField);
                    }
                }
            }
        };
    }

    public static ExpectedCmd wifiUpdateAuthorizedChannels() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34560,(short)3));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd wifiSetApChannel(final ArsdkFeatureWifi.SelectionType type, final ArsdkFeatureWifi.Band band, final int channel) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value) && (dec.readSignedInt() == band.value) && (dec.readUnsignedByte() == channel);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34560,(short)5));
                description.appendText(", type ").appendValue(type);
                description.appendText(", band ").appendValue(band);
                description.appendText(", channel ").appendValue(channel);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureWifi.SelectionType.fromValue(_type));
                    }
                    int _band = dec.readSignedInt();
                    if (!(_band == band.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("band was ").appendValue(ArsdkFeatureWifi.Band.fromValue(_band));
                    }
                    int _channel = dec.readUnsignedByte();
                    if (!(_channel == channel)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("channel was ").appendValue(_channel);
                    }
                }
            }
        };
    }

    public static ExpectedCmd wifiSetSecurity(final ArsdkFeatureWifi.SecurityType type, final String key, final ArsdkFeatureWifi.SecurityKeyType keyType) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value) && (dec.readString().equals(key)) && (dec.readSignedInt() == keyType.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34560,(short)7));
                description.appendText(", type ").appendValue(type);
                description.appendText(", key ").appendValue(key);
                description.appendText(", keyType ").appendValue(keyType);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureWifi.SecurityType.fromValue(_type));
                    }
                    String _key = dec.readString();
                    if (!(_key.equals(key))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("key was ").appendValue(_key);
                    }
                    int _keyType = dec.readSignedInt();
                    if (!(_keyType == keyType.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("keyType was ").appendValue(ArsdkFeatureWifi.SecurityKeyType.fromValue(_keyType));
                    }
                }
            }
        };
    }

    public static ExpectedCmd wifiSetCountry(final ArsdkFeatureWifi.CountrySelection selectionMode, final String code) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    return false;
                return !checkParams || (dec.readSignedInt() == selectionMode.value) && (dec.readString().equals(code));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34560,(short)9));
                description.appendText(", selectionMode ").appendValue(selectionMode);
                description.appendText(", code ").appendValue(code);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _selectionMode = dec.readSignedInt();
                    if (!(_selectionMode == selectionMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("selectionMode was ").appendValue(ArsdkFeatureWifi.CountrySelection.fromValue(_selectionMode));
                    }
                    String _code = dec.readString();
                    if (!(_code.equals(code))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("code was ").appendValue(_code);
                    }
                }
            }
        };
    }

    public static ExpectedCmd wifiSetEnvironment(final ArsdkFeatureWifi.Environment environment) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    return false;
                return !checkParams || (dec.readSignedInt() == environment.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34560,(short)11));
                description.appendText(", environment ").appendValue(environment);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 135 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _environment = dec.readSignedInt();
                    if (!(_environment == environment.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("environment was ").appendValue(ArsdkFeatureWifi.Environment.fromValue(_environment));
                    }
                }
            }
        };
    }

    public static ExpectedCmd rcMonitorChannels(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34816,(short)2));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd rcStartCalibration(final ArsdkFeatureRc.CalibrationType calibrationType, final ArsdkFeatureRc.ChannelAction channelAction, final ArsdkFeatureRc.ChannelType channelType) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    return false;
                return !checkParams || (dec.readSignedInt() == calibrationType.value) && (dec.readSignedInt() == channelAction.value) && (dec.readSignedInt() == channelType.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34816,(short)6));
                description.appendText(", calibrationType ").appendValue(calibrationType);
                description.appendText(", channelAction ").appendValue(channelAction);
                description.appendText(", channelType ").appendValue(channelType);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _calibrationType = dec.readSignedInt();
                    if (!(_calibrationType == calibrationType.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("calibrationType was ").appendValue(ArsdkFeatureRc.CalibrationType.fromValue(_calibrationType));
                    }
                    int _channelAction = dec.readSignedInt();
                    if (!(_channelAction == channelAction.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("channelAction was ").appendValue(ArsdkFeatureRc.ChannelAction.fromValue(_channelAction));
                    }
                    int _channelType = dec.readSignedInt();
                    if (!(_channelType == channelType.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("channelType was ").appendValue(ArsdkFeatureRc.ChannelType.fromValue(_channelType));
                    }
                }
            }
        };
    }

    public static ExpectedCmd rcInvertChannel(final ArsdkFeatureRc.ChannelAction action, final int flag) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    return false;
                return !checkParams || (dec.readSignedInt() == action.value) && (dec.readUnsignedByte() == flag);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34816,(short)8));
                description.appendText(", action ").appendValue(action);
                description.appendText(", flag ").appendValue(flag);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _action = dec.readSignedInt();
                    if (!(_action == action.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("action was ").appendValue(ArsdkFeatureRc.ChannelAction.fromValue(_action));
                    }
                    int _flag = dec.readUnsignedByte();
                    if (!(_flag == flag)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("flag was ").appendValue(_flag);
                    }
                }
            }
        };
    }

    public static ExpectedCmd rcAbortCalibration() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34816,(short)9));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd rcResetCalibration() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34816,(short)10));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd rcEnableReceiver(final int enable) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == enable);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)34816,(short)11));
                description.appendText(", enable ").appendValue(enable);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 136 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _enable = dec.readUnsignedByte();
                    if (!(_enable == enable)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("enable was ").appendValue(_enable);
                    }
                }
            }
        };
    }

    public static ExpectedCmd droneManagerDiscoverDrones() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 137 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35072,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 137 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd droneManagerConnect(final String serial, final String key) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 137 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readString().equals(serial)) && (dec.readString().equals(key));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35072,(short)3));
                description.appendText(", serial ").appendValue(serial);
                description.appendText(", key ").appendValue(key);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 137 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _serial = dec.readString();
                    if (!(_serial.equals(serial))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("serial was ").appendValue(_serial);
                    }
                    String _key = dec.readString();
                    if (!(_key.equals(key))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("key was ").appendValue(_key);
                    }
                }
            }
        };
    }

    public static ExpectedCmd droneManagerForget(final String serial) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 137 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readString().equals(serial));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35072,(short)4));
                description.appendText(", serial ").appendValue(serial);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 137 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _serial = dec.readString();
                    if (!(_serial.equals(serial))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("serial was ").appendValue(_serial);
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperGrab(final long buttons, final long axes) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedInt() == buttons) && (dec.readUnsignedInt() == axes);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35328,(short)1));
                description.appendText(", buttons ").appendValue(buttons);
                description.appendText(", axes ").appendValue(axes);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    long _buttons = dec.readUnsignedInt();
                    if (!(_buttons == buttons)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("buttons was ").appendValue(_buttons);
                    }
                    long _axes = dec.readUnsignedInt();
                    if (!(_axes == axes)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("axes was ").appendValue(_axes);
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperMapButtonAction(final int product, final ArsdkFeatureMapper.ButtonAction action, final long buttons) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == product) && (dec.readSignedInt() == action.value) && (dec.readUnsignedInt() == buttons);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35328,(short)5));
                description.appendText(", product ").appendValue(product);
                description.appendText(", action ").appendValue(action);
                description.appendText(", buttons ").appendValue(buttons);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _product = dec.readUnsignedShort();
                    if (!(_product == product)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("product was ").appendValue(_product);
                    }
                    int _action = dec.readSignedInt();
                    if (!(_action == action.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("action was ").appendValue(ArsdkFeatureMapper.ButtonAction.fromValue(_action));
                    }
                    long _buttons = dec.readUnsignedInt();
                    if (!(_buttons == buttons)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("buttons was ").appendValue(_buttons);
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperMapAxisAction(final int product, final ArsdkFeatureMapper.AxisAction action, final int axis, final long buttons) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == product) && (dec.readSignedInt() == action.value) && (dec.readSignedInt() == axis) && (dec.readUnsignedInt() == buttons);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35328,(short)6));
                description.appendText(", product ").appendValue(product);
                description.appendText(", action ").appendValue(action);
                description.appendText(", axis ").appendValue(axis);
                description.appendText(", buttons ").appendValue(buttons);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _product = dec.readUnsignedShort();
                    if (!(_product == product)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("product was ").appendValue(_product);
                    }
                    int _action = dec.readSignedInt();
                    if (!(_action == action.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("action was ").appendValue(ArsdkFeatureMapper.AxisAction.fromValue(_action));
                    }
                    int _axis = dec.readSignedInt();
                    if (!(_axis == axis)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("axis was ").appendValue(_axis);
                    }
                    long _buttons = dec.readUnsignedInt();
                    if (!(_buttons == buttons)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("buttons was ").appendValue(_buttons);
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperResetMapping(final int product) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == product);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35328,(short)11));
                description.appendText(", product ").appendValue(product);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _product = dec.readUnsignedShort();
                    if (!(_product == product)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("product was ").appendValue(_product);
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperSetExpo(final int product, final int axis, final ArsdkFeatureMapper.ExpoType expo) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == product) && (dec.readSignedInt() == axis) && (dec.readSignedInt() == expo.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35328,(short)12));
                description.appendText(", product ").appendValue(product);
                description.appendText(", axis ").appendValue(axis);
                description.appendText(", expo ").appendValue(expo);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _product = dec.readUnsignedShort();
                    if (!(_product == product)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("product was ").appendValue(_product);
                    }
                    int _axis = dec.readSignedInt();
                    if (!(_axis == axis)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("axis was ").appendValue(_axis);
                    }
                    int _expo = dec.readSignedInt();
                    if (!(_expo == expo.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("expo was ").appendValue(ArsdkFeatureMapper.ExpoType.fromValue(_expo));
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperSetInverted(final int product, final int axis, final int inverted) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == product) && (dec.readSignedInt() == axis) && (dec.readUnsignedByte() == inverted);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35328,(short)14));
                description.appendText(", product ").appendValue(product);
                description.appendText(", axis ").appendValue(axis);
                description.appendText(", inverted ").appendValue(inverted);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _product = dec.readUnsignedShort();
                    if (!(_product == product)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("product was ").appendValue(_product);
                    }
                    int _axis = dec.readSignedInt();
                    if (!(_axis == axis)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("axis was ").appendValue(_axis);
                    }
                    int _inverted = dec.readUnsignedByte();
                    if (!(_inverted == inverted)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("inverted was ").appendValue(_inverted);
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperEnterVolatileMapping() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 17)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35328,(short)17));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 17)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd mapperExitVolatileMapping() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35328,(short)18));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 138 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd debugGetAllSettings() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 139 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35584,(short)0));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 139 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 0)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd debugSetSetting(final int id, final String value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 139 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == id) && (dec.readString().equals(value));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35584,(short)1));
                description.appendText(", id ").appendValue(id);
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 139 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedShort();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                    String _value = dec.readString();
                    if (!(_value.equals(value))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(_value);
                    }
                }
            }
        };
    }

    public static ExpectedCmd controllerInfoGps(final double latitude, final double longitude, final float altitude, final float horizontalAccuracy, final float verticalAccuracy, final float northSpeed, final float eastSpeed, final float downSpeed, final double timestamp) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 140 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readDouble() == latitude) && (dec.readDouble() == longitude) && (dec.readFloat() == altitude) && (dec.readFloat() == horizontalAccuracy) && (dec.readFloat() == verticalAccuracy) && (dec.readFloat() == northSpeed) && (dec.readFloat() == eastSpeed) && (dec.readFloat() == downSpeed) && (dec.readDouble() == timestamp);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35840,(short)1));
                description.appendText(", latitude ").appendValue(latitude);
                description.appendText(", longitude ").appendValue(longitude);
                description.appendText(", altitude ").appendValue(altitude);
                description.appendText(", horizontalAccuracy ").appendValue(horizontalAccuracy);
                description.appendText(", verticalAccuracy ").appendValue(verticalAccuracy);
                description.appendText(", northSpeed ").appendValue(northSpeed);
                description.appendText(", eastSpeed ").appendValue(eastSpeed);
                description.appendText(", downSpeed ").appendValue(downSpeed);
                description.appendText(", timestamp ").appendValue(timestamp);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 140 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                    float _altitude = dec.readFloat();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                    float _horizontalAccuracy = dec.readFloat();
                    if (!(_horizontalAccuracy == horizontalAccuracy)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("horizontalAccuracy was ").appendValue(_horizontalAccuracy);
                    }
                    float _verticalAccuracy = dec.readFloat();
                    if (!(_verticalAccuracy == verticalAccuracy)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalAccuracy was ").appendValue(_verticalAccuracy);
                    }
                    float _northSpeed = dec.readFloat();
                    if (!(_northSpeed == northSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("northSpeed was ").appendValue(_northSpeed);
                    }
                    float _eastSpeed = dec.readFloat();
                    if (!(_eastSpeed == eastSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("eastSpeed was ").appendValue(_eastSpeed);
                    }
                    float _downSpeed = dec.readFloat();
                    if (!(_downSpeed == downSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("downSpeed was ").appendValue(_downSpeed);
                    }
                    double _timestamp = dec.readDouble();
                    if (!(_timestamp == timestamp)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("timestamp was ").appendValue(_timestamp);
                    }
                }
            }
        };
    }

    public static ExpectedCmd controllerInfoBarometer(final float pressure, final double timestamp) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 140 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readFloat() == pressure) && (dec.readDouble() == timestamp);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)35840,(short)2));
                description.appendText(", pressure ").appendValue(pressure);
                description.appendText(", timestamp ").appendValue(timestamp);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 140 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _pressure = dec.readFloat();
                    if (!(_pressure == pressure)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pressure was ").appendValue(_pressure);
                    }
                    double _timestamp = dec.readDouble();
                    if (!(_timestamp == timestamp)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("timestamp was ").appendValue(_timestamp);
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperMiniMapButtonAction(final int modesBitField, final ArsdkFeatureMapperMini.ButtonAction action, final long buttons) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 141 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == modesBitField) && (dec.readSignedInt() == action.value) && (dec.readUnsignedInt() == buttons);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36096,(short)1));
                description.appendText(", modesBitField ").appendValue(modesBitField);
                description.appendText(", action ").appendValue(action);
                description.appendText(", buttons ").appendValue(buttons);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 141 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _modesBitField = dec.readUnsignedByte();
                    if (!(_modesBitField == modesBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("modesBitField was ").appendValue(_modesBitField);
                    }
                    int _action = dec.readSignedInt();
                    if (!(_action == action.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("action was ").appendValue(ArsdkFeatureMapperMini.ButtonAction.fromValue(_action));
                    }
                    long _buttons = dec.readUnsignedInt();
                    if (!(_buttons == buttons)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("buttons was ").appendValue(_buttons);
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperMiniMapAxisAction(final int modesBitField, final ArsdkFeatureMapperMini.AxisAction action, final int axis, final long buttons) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 141 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == modesBitField) && (dec.readSignedInt() == action.value) && (dec.readSignedByte() == axis) && (dec.readUnsignedInt() == buttons);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36096,(short)2));
                description.appendText(", modesBitField ").appendValue(modesBitField);
                description.appendText(", action ").appendValue(action);
                description.appendText(", axis ").appendValue(axis);
                description.appendText(", buttons ").appendValue(buttons);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 141 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _modesBitField = dec.readUnsignedByte();
                    if (!(_modesBitField == modesBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("modesBitField was ").appendValue(_modesBitField);
                    }
                    int _action = dec.readSignedInt();
                    if (!(_action == action.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("action was ").appendValue(ArsdkFeatureMapperMini.AxisAction.fromValue(_action));
                    }
                    int _axis = dec.readSignedByte();
                    if (!(_axis == axis)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("axis was ").appendValue(_axis);
                    }
                    long _buttons = dec.readUnsignedInt();
                    if (!(_buttons == buttons)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("buttons was ").appendValue(_buttons);
                    }
                }
            }
        };
    }

    public static ExpectedCmd mapperMiniResetMapping(final int modesBitField) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 141 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == modesBitField);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36096,(short)5));
                description.appendText(", modesBitField ").appendValue(modesBitField);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 141 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _modesBitField = dec.readUnsignedByte();
                    if (!(_modesBitField == modesBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("modesBitField was ").appendValue(_modesBitField);
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalCamActivate(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36352,(short)1));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalCamDeactivate(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36352,(short)2));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalCamSetSensitivity(final int camId, final ArsdkFeatureThermalCam.Range range) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == range.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36352,(short)4));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", range ").appendValue(range);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _range = dec.readSignedInt();
                    if (!(_range == range.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("range was ").appendValue(ArsdkFeatureThermalCam.Range.fromValue(_range));
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalCamFlatFieldCalibrate(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36352,(short)8));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalCamSetFlatFieldCalibrationMode(final int camId, final ArsdkFeatureThermalCam.FlatFieldCalibrationMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36352,(short)10));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 142 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureThermalCam.FlatFieldCalibrationMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetExposureSettings(final int camId, final ArsdkFeatureCamera.ExposureMode mode, final ArsdkFeatureCamera.ShutterSpeed shutterSpeed, final ArsdkFeatureCamera.IsoSensitivity isoSensitivity, final ArsdkFeatureCamera.IsoSensitivity maxIsoSensitivity, final ArsdkFeatureCamera.AutoExposureMeteringMode meteringMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == mode.value) && (dec.readSignedInt() == shutterSpeed.value) && (dec.readSignedInt() == isoSensitivity.value) && (dec.readSignedInt() == maxIsoSensitivity.value) && (dec.readSignedInt() == meteringMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)5));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", mode ").appendValue(mode);
                description.appendText(", shutterSpeed ").appendValue(shutterSpeed);
                description.appendText(", isoSensitivity ").appendValue(isoSensitivity);
                description.appendText(", maxIsoSensitivity ").appendValue(maxIsoSensitivity);
                description.appendText(", meteringMode ").appendValue(meteringMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureCamera.ExposureMode.fromValue(_mode));
                    }
                    int _shutterSpeed = dec.readSignedInt();
                    if (!(_shutterSpeed == shutterSpeed.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("shutterSpeed was ").appendValue(ArsdkFeatureCamera.ShutterSpeed.fromValue(_shutterSpeed));
                    }
                    int _isoSensitivity = dec.readSignedInt();
                    if (!(_isoSensitivity == isoSensitivity.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("isoSensitivity was ").appendValue(ArsdkFeatureCamera.IsoSensitivity.fromValue(_isoSensitivity));
                    }
                    int _maxIsoSensitivity = dec.readSignedInt();
                    if (!(_maxIsoSensitivity == maxIsoSensitivity.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("maxIsoSensitivity was ").appendValue(ArsdkFeatureCamera.IsoSensitivity.fromValue(_maxIsoSensitivity));
                    }
                    int _meteringMode = dec.readSignedInt();
                    if (!(_meteringMode == meteringMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("meteringMode was ").appendValue(ArsdkFeatureCamera.AutoExposureMeteringMode.fromValue(_meteringMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraLockExposure(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)6));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraLockExposureOnRoi(final int camId, final float roiCenterX, final float roiCenterY) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readFloat() == roiCenterX) && (dec.readFloat() == roiCenterY);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)7));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", roiCenterX ").appendValue(roiCenterX);
                description.appendText(", roiCenterY ").appendValue(roiCenterY);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    float _roiCenterX = dec.readFloat();
                    if (!(_roiCenterX == roiCenterX)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("roiCenterX was ").appendValue(_roiCenterX);
                    }
                    float _roiCenterY = dec.readFloat();
                    if (!(_roiCenterY == roiCenterY)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("roiCenterY was ").appendValue(_roiCenterY);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraUnlockExposure(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)8));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetWhiteBalance(final int camId, final ArsdkFeatureCamera.WhiteBalanceMode mode, final ArsdkFeatureCamera.WhiteBalanceTemperature temperature) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == mode.value) && (dec.readSignedInt() == temperature.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)11));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", mode ").appendValue(mode);
                description.appendText(", temperature ").appendValue(temperature);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureCamera.WhiteBalanceMode.fromValue(_mode));
                    }
                    int _temperature = dec.readSignedInt();
                    if (!(_temperature == temperature.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("temperature was ").appendValue(ArsdkFeatureCamera.WhiteBalanceTemperature.fromValue(_temperature));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetWhiteBalanceLock(final int camId, final ArsdkFeatureCamera.State state) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == state.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)12));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", state ").appendValue(state);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _state = dec.readSignedInt();
                    if (!(_state == state.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("state was ").appendValue(ArsdkFeatureCamera.State.fromValue(_state));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetEvCompensation(final int camId, final ArsdkFeatureCamera.EvCompensation value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == value.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)14));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _value = dec.readSignedInt();
                    if (!(_value == value.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(ArsdkFeatureCamera.EvCompensation.fromValue(_value));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetAntiflickerMode(final ArsdkFeatureCamera.AntiflickerMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)16));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureCamera.AntiflickerMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetStyle(final int camId, final ArsdkFeatureCamera.Style style) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == style.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)18));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", style ").appendValue(style);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _style = dec.readSignedInt();
                    if (!(_style == style.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("style was ").appendValue(ArsdkFeatureCamera.Style.fromValue(_style));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetStyleParams(final int camId, final int saturation, final int contrast, final int sharpness) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 19)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedByte() == saturation) && (dec.readSignedByte() == contrast) && (dec.readSignedByte() == sharpness);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)19));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", saturation ").appendValue(saturation);
                description.appendText(", contrast ").appendValue(contrast);
                description.appendText(", sharpness ").appendValue(sharpness);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 19)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _saturation = dec.readSignedByte();
                    if (!(_saturation == saturation)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("saturation was ").appendValue(_saturation);
                    }
                    int _contrast = dec.readSignedByte();
                    if (!(_contrast == contrast)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("contrast was ").appendValue(_contrast);
                    }
                    int _sharpness = dec.readSignedByte();
                    if (!(_sharpness == sharpness)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("sharpness was ").appendValue(_sharpness);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetZoomTarget(final int camId, final ArsdkFeatureCamera.ZoomControlMode controlMode, final float target) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 21)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == controlMode.value) && (dec.readFloat() == target);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)21));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", controlMode ").appendValue(controlMode);
                description.appendText(", target ").appendValue(target);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 21)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _controlMode = dec.readSignedInt();
                    if (!(_controlMode == controlMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("controlMode was ").appendValue(ArsdkFeatureCamera.ZoomControlMode.fromValue(_controlMode));
                    }
                    float _target = dec.readFloat();
                    if (!(_target == target)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("target was ").appendValue(_target);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetMaxZoomSpeed(final int camId, final float max) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 25)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readFloat() == max);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)25));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", max ").appendValue(max);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 25)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    float _max = dec.readFloat();
                    if (!(_max == max)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("max was ").appendValue(_max);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetZoomVelocityQualityDegradation(final int camId, final int allow) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 27)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readUnsignedByte() == allow);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)27));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", allow ").appendValue(allow);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 27)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _allow = dec.readUnsignedByte();
                    if (!(_allow == allow)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("allow was ").appendValue(_allow);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetHdrSetting(final int camId, final ArsdkFeatureCamera.State value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 28)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == value.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)28));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 28)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _value = dec.readSignedInt();
                    if (!(_value == value.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(ArsdkFeatureCamera.State.fromValue(_value));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetCameraMode(final int camId, final ArsdkFeatureCamera.CameraMode value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 31)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == value.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)31));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 31)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _value = dec.readSignedInt();
                    if (!(_value == value.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(ArsdkFeatureCamera.CameraMode.fromValue(_value));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetRecordingMode(final int camId, final ArsdkFeatureCamera.RecordingMode mode, final ArsdkFeatureCamera.Resolution resolution, final ArsdkFeatureCamera.Framerate framerate, final ArsdkFeatureCamera.HyperlapseValue hyperlapse) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 33)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == mode.value) && (dec.readSignedInt() == resolution.value) && (dec.readSignedInt() == framerate.value) && (dec.readSignedInt() == hyperlapse.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)33));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", mode ").appendValue(mode);
                description.appendText(", resolution ").appendValue(resolution);
                description.appendText(", framerate ").appendValue(framerate);
                description.appendText(", hyperlapse ").appendValue(hyperlapse);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 33)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureCamera.RecordingMode.fromValue(_mode));
                    }
                    int _resolution = dec.readSignedInt();
                    if (!(_resolution == resolution.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("resolution was ").appendValue(ArsdkFeatureCamera.Resolution.fromValue(_resolution));
                    }
                    int _framerate = dec.readSignedInt();
                    if (!(_framerate == framerate.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("framerate was ").appendValue(ArsdkFeatureCamera.Framerate.fromValue(_framerate));
                    }
                    int _hyperlapse = dec.readSignedInt();
                    if (!(_hyperlapse == hyperlapse.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("hyperlapse was ").appendValue(ArsdkFeatureCamera.HyperlapseValue.fromValue(_hyperlapse));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetPhotoMode(final int camId, final ArsdkFeatureCamera.PhotoMode mode, final ArsdkFeatureCamera.PhotoFormat format, final ArsdkFeatureCamera.PhotoFileFormat fileFormat, final ArsdkFeatureCamera.BurstValue burst, final ArsdkFeatureCamera.BracketingPreset bracketing, final float captureInterval) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 35)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == mode.value) && (dec.readSignedInt() == format.value) && (dec.readSignedInt() == fileFormat.value) && (dec.readSignedInt() == burst.value) && (dec.readSignedInt() == bracketing.value) && (dec.readFloat() == captureInterval);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)35));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", mode ").appendValue(mode);
                description.appendText(", format ").appendValue(format);
                description.appendText(", fileFormat ").appendValue(fileFormat);
                description.appendText(", burst ").appendValue(burst);
                description.appendText(", bracketing ").appendValue(bracketing);
                description.appendText(", captureInterval ").appendValue(captureInterval);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 35)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureCamera.PhotoMode.fromValue(_mode));
                    }
                    int _format = dec.readSignedInt();
                    if (!(_format == format.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("format was ").appendValue(ArsdkFeatureCamera.PhotoFormat.fromValue(_format));
                    }
                    int _fileFormat = dec.readSignedInt();
                    if (!(_fileFormat == fileFormat.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("fileFormat was ").appendValue(ArsdkFeatureCamera.PhotoFileFormat.fromValue(_fileFormat));
                    }
                    int _burst = dec.readSignedInt();
                    if (!(_burst == burst.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("burst was ").appendValue(ArsdkFeatureCamera.BurstValue.fromValue(_burst));
                    }
                    int _bracketing = dec.readSignedInt();
                    if (!(_bracketing == bracketing.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("bracketing was ").appendValue(ArsdkFeatureCamera.BracketingPreset.fromValue(_bracketing));
                    }
                    float _captureInterval = dec.readFloat();
                    if (!(_captureInterval == captureInterval)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("captureInterval was ").appendValue(_captureInterval);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetStreamingMode(final int camId, final ArsdkFeatureCamera.StreamingMode value) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 37)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == value.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)37));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", value ").appendValue(value);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 37)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _value = dec.readSignedInt();
                    if (!(_value == value.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("value was ").appendValue(ArsdkFeatureCamera.StreamingMode.fromValue(_value));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraTakePhoto(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 39)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)39));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 39)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraStartRecording(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 42)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)42));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 42)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraStopRecording(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 43)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)43));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 43)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetAutorecord(final int camId, final ArsdkFeatureCamera.State state) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 46)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readSignedInt() == state.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)46));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", state ").appendValue(state);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 46)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    int _state = dec.readSignedInt();
                    if (!(_state == state.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("state was ").appendValue(ArsdkFeatureCamera.State.fromValue(_state));
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraResetZoom(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 48)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)48));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 48)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraStopPhoto(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 50)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)50));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 50)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraSetAlignmentOffsets(final int camId, final float yaw, final float pitch, final float roll) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 53)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId) && (dec.readFloat() == yaw) && (dec.readFloat() == pitch) && (dec.readFloat() == roll);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)53));
                description.appendText(", camId ").appendValue(camId);
                description.appendText(", yaw ").appendValue(yaw);
                description.appendText(", pitch ").appendValue(pitch);
                description.appendText(", roll ").appendValue(roll);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 53)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                    float _yaw = dec.readFloat();
                    if (!(_yaw == yaw)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("yaw was ").appendValue(_yaw);
                    }
                    float _pitch = dec.readFloat();
                    if (!(_pitch == pitch)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pitch was ").appendValue(_pitch);
                    }
                    float _roll = dec.readFloat();
                    if (!(_roll == roll)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("roll was ").appendValue(_roll);
                    }
                }
            }
        };
    }

    public static ExpectedCmd cameraResetAlignmentOffsets(final int camId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 54)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == camId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36608,(short)54));
                description.appendText(", camId ").appendValue(camId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 143 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 54)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _camId = dec.readUnsignedByte();
                    if (!(_camId == camId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("camId was ").appendValue(_camId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationCancel() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)3));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd animationStartFlip(final ArsdkFeatureAnimation.FlipType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)4));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureAnimation.FlipType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartHorizontalPanorama(final int providedParamsBitField, final float rotationAngle, final float rotationSpeed) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == rotationAngle) && (dec.readFloat() == rotationSpeed);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)6));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", rotationAngle ").appendValue(rotationAngle);
                description.appendText(", rotationSpeed ").appendValue(rotationSpeed);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _rotationAngle = dec.readFloat();
                    if (!(_rotationAngle == rotationAngle)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rotationAngle was ").appendValue(_rotationAngle);
                    }
                    float _rotationSpeed = dec.readFloat();
                    if (!(_rotationSpeed == rotationSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rotationSpeed was ").appendValue(_rotationSpeed);
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartDronie(final int providedParamsBitField, final float speed, final float distance, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == speed) && (dec.readFloat() == distance) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)8));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", distance ").appendValue(distance);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _distance = dec.readFloat();
                    if (!(_distance == distance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("distance was ").appendValue(_distance);
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartHorizontalReveal(final int providedParamsBitField, final float speed, final float distance, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == speed) && (dec.readFloat() == distance) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)10));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", distance ").appendValue(distance);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _distance = dec.readFloat();
                    if (!(_distance == distance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("distance was ").appendValue(_distance);
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartVerticalReveal(final int providedParamsBitField, final float speed, final float verticalDistance, final float rotationAngle, final float rotationSpeed, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == speed) && (dec.readFloat() == verticalDistance) && (dec.readFloat() == rotationAngle) && (dec.readFloat() == rotationSpeed) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)12));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", verticalDistance ").appendValue(verticalDistance);
                description.appendText(", rotationAngle ").appendValue(rotationAngle);
                description.appendText(", rotationSpeed ").appendValue(rotationSpeed);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _verticalDistance = dec.readFloat();
                    if (!(_verticalDistance == verticalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalDistance was ").appendValue(_verticalDistance);
                    }
                    float _rotationAngle = dec.readFloat();
                    if (!(_rotationAngle == rotationAngle)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rotationAngle was ").appendValue(_rotationAngle);
                    }
                    float _rotationSpeed = dec.readFloat();
                    if (!(_rotationSpeed == rotationSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rotationSpeed was ").appendValue(_rotationSpeed);
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartSpiral(final int providedParamsBitField, final float speed, final float radiusVariation, final float verticalDistance, final float revolutionNb, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == speed) && (dec.readFloat() == radiusVariation) && (dec.readFloat() == verticalDistance) && (dec.readFloat() == revolutionNb) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)14));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", radiusVariation ").appendValue(radiusVariation);
                description.appendText(", verticalDistance ").appendValue(verticalDistance);
                description.appendText(", revolutionNb ").appendValue(revolutionNb);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _radiusVariation = dec.readFloat();
                    if (!(_radiusVariation == radiusVariation)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("radiusVariation was ").appendValue(_radiusVariation);
                    }
                    float _verticalDistance = dec.readFloat();
                    if (!(_verticalDistance == verticalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalDistance was ").appendValue(_verticalDistance);
                    }
                    float _revolutionNb = dec.readFloat();
                    if (!(_revolutionNb == revolutionNb)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("revolutionNb was ").appendValue(_revolutionNb);
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartParabola(final int providedParamsBitField, final float speed, final float verticalDistance, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == speed) && (dec.readFloat() == verticalDistance) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)16));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", verticalDistance ").appendValue(verticalDistance);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _verticalDistance = dec.readFloat();
                    if (!(_verticalDistance == verticalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalDistance was ").appendValue(_verticalDistance);
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartCandle(final int providedParamsBitField, final float speed, final float verticalDistance, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == speed) && (dec.readFloat() == verticalDistance) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)18));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", verticalDistance ").appendValue(verticalDistance);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _verticalDistance = dec.readFloat();
                    if (!(_verticalDistance == verticalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalDistance was ").appendValue(_verticalDistance);
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartDollySlide(final int providedParamsBitField, final float speed, final float angle, final float horizontalDistance, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 20)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == speed) && (dec.readFloat() == angle) && (dec.readFloat() == horizontalDistance) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)20));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", angle ").appendValue(angle);
                description.appendText(", horizontalDistance ").appendValue(horizontalDistance);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 20)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _angle = dec.readFloat();
                    if (!(_angle == angle)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("angle was ").appendValue(_angle);
                    }
                    float _horizontalDistance = dec.readFloat();
                    if (!(_horizontalDistance == horizontalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("horizontalDistance was ").appendValue(_horizontalDistance);
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartVertigo(final int providedParamsBitField, final float duration, final float maxZoomLevel, final ArsdkFeatureAnimation.VertigoFinishAction finishAction, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 22)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == duration) && (dec.readFloat() == maxZoomLevel) && (dec.readSignedInt() == finishAction.value) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)22));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", duration ").appendValue(duration);
                description.appendText(", maxZoomLevel ").appendValue(maxZoomLevel);
                description.appendText(", finishAction ").appendValue(finishAction);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 22)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _duration = dec.readFloat();
                    if (!(_duration == duration)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("duration was ").appendValue(_duration);
                    }
                    float _maxZoomLevel = dec.readFloat();
                    if (!(_maxZoomLevel == maxZoomLevel)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("maxZoomLevel was ").appendValue(_maxZoomLevel);
                    }
                    int _finishAction = dec.readSignedInt();
                    if (!(_finishAction == finishAction.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("finishAction was ").appendValue(ArsdkFeatureAnimation.VertigoFinishAction.fromValue(_finishAction));
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartTwistUp(final int providedParamsBitField, final float speed, final float verticalDistance, final float rotationAngle, final float rotationSpeed, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 24)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == speed) && (dec.readFloat() == verticalDistance) && (dec.readFloat() == rotationAngle) && (dec.readFloat() == rotationSpeed) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)24));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", verticalDistance ").appendValue(verticalDistance);
                description.appendText(", rotationAngle ").appendValue(rotationAngle);
                description.appendText(", rotationSpeed ").appendValue(rotationSpeed);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 24)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _verticalDistance = dec.readFloat();
                    if (!(_verticalDistance == verticalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalDistance was ").appendValue(_verticalDistance);
                    }
                    float _rotationAngle = dec.readFloat();
                    if (!(_rotationAngle == rotationAngle)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rotationAngle was ").appendValue(_rotationAngle);
                    }
                    float _rotationSpeed = dec.readFloat();
                    if (!(_rotationSpeed == rotationSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rotationSpeed was ").appendValue(_rotationSpeed);
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartPositionTwistUp(final int providedParamsBitField, final float speed, final float verticalDistance, final float rotationAngle, final float rotationSpeed, final ArsdkFeatureAnimation.PlayMode playMode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 26)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == providedParamsBitField) && (dec.readFloat() == speed) && (dec.readFloat() == verticalDistance) && (dec.readFloat() == rotationAngle) && (dec.readFloat() == rotationSpeed) && (dec.readSignedInt() == playMode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)26));
                description.appendText(", providedParamsBitField ").appendValue(providedParamsBitField);
                description.appendText(", speed ").appendValue(speed);
                description.appendText(", verticalDistance ").appendValue(verticalDistance);
                description.appendText(", rotationAngle ").appendValue(rotationAngle);
                description.appendText(", rotationSpeed ").appendValue(rotationSpeed);
                description.appendText(", playMode ").appendValue(playMode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 26)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _providedParamsBitField = dec.readUnsignedByte();
                    if (!(_providedParamsBitField == providedParamsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("providedParamsBitField was ").appendValue(_providedParamsBitField);
                    }
                    float _speed = dec.readFloat();
                    if (!(_speed == speed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("speed was ").appendValue(_speed);
                    }
                    float _verticalDistance = dec.readFloat();
                    if (!(_verticalDistance == verticalDistance)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("verticalDistance was ").appendValue(_verticalDistance);
                    }
                    float _rotationAngle = dec.readFloat();
                    if (!(_rotationAngle == rotationAngle)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rotationAngle was ").appendValue(_rotationAngle);
                    }
                    float _rotationSpeed = dec.readFloat();
                    if (!(_rotationSpeed == rotationSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rotationSpeed was ").appendValue(_rotationSpeed);
                    }
                    int _playMode = dec.readSignedInt();
                    if (!(_playMode == playMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("playMode was ").appendValue(ArsdkFeatureAnimation.PlayMode.fromValue(_playMode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd animationStartHorizontal180PhotoPanorama() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 28)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)28));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 28)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd animationStartVertical180PhotoPanorama() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 30)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)30));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 30)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd animationStartSphericalPhotoPanorama() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 32)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)36864,(short)32));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 144 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 32)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd userStorageFormat(final String label) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readString().equals(label));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37120,(short)4));
                description.appendText(", label ").appendValue(label);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _label = dec.readString();
                    if (!(_label.equals(label))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("label was ").appendValue(_label);
                    }
                }
            }
        };
    }

    public static ExpectedCmd userStorageStartMonitoring(final int period) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == period);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37120,(short)5));
                description.appendText(", period ").appendValue(period);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _period = dec.readUnsignedByte();
                    if (!(_period == period)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("period was ").appendValue(_period);
                    }
                }
            }
        };
    }

    public static ExpectedCmd userStorageStopMonitoring() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37120,(short)6));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd userStorageFormatWithType(final String label, final ArsdkFeatureUserStorage.FormattingType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    return false;
                return !checkParams || (dec.readString().equals(label)) && (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37120,(short)10));
                description.appendText(", label ").appendValue(label);
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _label = dec.readString();
                    if (!(_label.equals(label))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("label was ").appendValue(_label);
                    }
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureUserStorage.FormattingType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd userStorageEncryptionPassword(final String password, final ArsdkFeatureUserStorage.PasswordUsage type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readString().equals(password)) && (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37120,(short)12));
                description.appendText(", password ").appendValue(password);
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _password = dec.readString();
                    if (!(_password.equals(password))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("password was ").appendValue(_password);
                    }
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureUserStorage.PasswordUsage.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd userStorageFormatWithEncryption(final String label, final String password, final ArsdkFeatureUserStorage.FormattingType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 13)
                    return false;
                return !checkParams || (dec.readString().equals(label)) && (dec.readString().equals(password)) && (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37120,(short)13));
                description.appendText(", label ").appendValue(label);
                description.appendText(", password ").appendValue(password);
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 145 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 13)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    String _label = dec.readString();
                    if (!(_label.equals(label))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("label was ").appendValue(_label);
                    }
                    String _password = dec.readString();
                    if (!(_password.equals(password))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("password was ").appendValue(_password);
                    }
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureUserStorage.FormattingType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd rthSetPreferredHomeType(final ArsdkFeatureRth.HomeType type) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readSignedInt() == type.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)4));
                description.appendText(", type ").appendValue(type);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _type = dec.readSignedInt();
                    if (!(_type == type.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("type was ").appendValue(ArsdkFeatureRth.HomeType.fromValue(_type));
                    }
                }
            }
        };
    }

    public static ExpectedCmd rthSetCustomLocation(final double latitude, final double longitude, final float altitude) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    return false;
                return !checkParams || (dec.readDouble() == latitude) && (dec.readDouble() == longitude) && (dec.readFloat() == altitude);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)6));
                description.appendText(", latitude ").appendValue(latitude);
                description.appendText(", longitude ").appendValue(longitude);
                description.appendText(", altitude ").appendValue(altitude);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                    float _altitude = dec.readFloat();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                }
            }
        };
    }

    public static ExpectedCmd rthSetDelay(final int delay) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    return false;
                return !checkParams || (dec.readUnsignedShort() == delay);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)9));
                description.appendText(", delay ").appendValue(delay);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _delay = dec.readUnsignedShort();
                    if (!(_delay == delay)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("delay was ").appendValue(_delay);
                    }
                }
            }
        };
    }

    public static ExpectedCmd rthReturnToHome() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)11));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd rthAbort() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)12));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd rthCancelAutoTrigger() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)16));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd rthSetMinAltitude(final float altitude) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 17)
                    return false;
                return !checkParams || (dec.readFloat() == altitude);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)17));
                description.appendText(", altitude ").appendValue(altitude);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 17)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _altitude = dec.readFloat();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                }
            }
        };
    }

    public static ExpectedCmd rthSetAutoTriggerMode(final ArsdkFeatureRth.AutoTriggerMode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 19)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)19));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 19)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureRth.AutoTriggerMode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd rthSetEndingBehavior(final ArsdkFeatureRth.EndingBehavior endingBehavior) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 21)
                    return false;
                return !checkParams || (dec.readSignedInt() == endingBehavior.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)21));
                description.appendText(", endingBehavior ").appendValue(endingBehavior);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 21)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _endingBehavior = dec.readSignedInt();
                    if (!(_endingBehavior == endingBehavior.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("endingBehavior was ").appendValue(ArsdkFeatureRth.EndingBehavior.fromValue(_endingBehavior));
                    }
                }
            }
        };
    }

    public static ExpectedCmd rthSetEndingHoveringAltitude(final float altitude) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 23)
                    return false;
                return !checkParams || (dec.readFloat() == altitude);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37376,(short)23));
                description.appendText(", altitude ").appendValue(altitude);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 146 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 23)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _altitude = dec.readFloat();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                }
            }
        };
    }

    public static ExpectedCmd sequoiaCamRadiometricCalibStart(final int id) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == id);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37632,(short)3));
                description.appendText(", id ").appendValue(id);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedByte();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                }
            }
        };
    }

    public static ExpectedCmd sequoiaCamOpenSession(final int id, final String name) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == id) && (dec.readString().equals(name));
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37632,(short)4));
                description.appendText(", id ").appendValue(id);
                description.appendText(", name ").appendValue(name);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedByte();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                    String _name = dec.readString();
                    if (!(_name.equals(name))) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("name was ").appendValue(_name);
                    }
                }
            }
        };
    }

    public static ExpectedCmd sequoiaCamCloseSession(final int id) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == id);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37632,(short)5));
                description.appendText(", id ").appendValue(id);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedByte();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                }
            }
        };
    }

    public static ExpectedCmd sequoiaCamSetLiveStitchMask(final int id, final int sensorsMaskBitField) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == id) && (dec.readUnsignedByte() == sensorsMaskBitField);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37632,(short)7));
                description.appendText(", id ").appendValue(id);
                description.appendText(", sensorsMaskBitField ").appendValue(sensorsMaskBitField);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 7)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedByte();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                    int _sensorsMaskBitField = dec.readUnsignedByte();
                    if (!(_sensorsMaskBitField == sensorsMaskBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("sensorsMaskBitField was ").appendValue(_sensorsMaskBitField);
                    }
                }
            }
        };
    }

    public static ExpectedCmd sequoiaCamGetStorageInfos(final int id) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == id);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37632,(short)12));
                description.appendText(", id ").appendValue(id);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedByte();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                }
            }
        };
    }

    public static ExpectedCmd sequoiaCamFactoryReset(final int id) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 13)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == id);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37632,(short)13));
                description.appendText(", id ").appendValue(id);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 147 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 13)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _id = dec.readUnsignedByte();
                    if (!(_id == id)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("id was ").appendValue(_id);
                    }
                }
            }
        };
    }

    public static ExpectedCmd gimbalSetMaxSpeed(final int gimbalId, final float yaw, final float pitch, final float roll) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == gimbalId) && (dec.readFloat() == yaw) && (dec.readFloat() == pitch) && (dec.readFloat() == roll);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37888,(short)4));
                description.appendText(", gimbalId ").appendValue(gimbalId);
                description.appendText(", yaw ").appendValue(yaw);
                description.appendText(", pitch ").appendValue(pitch);
                description.appendText(", roll ").appendValue(roll);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _gimbalId = dec.readUnsignedByte();
                    if (!(_gimbalId == gimbalId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gimbalId was ").appendValue(_gimbalId);
                    }
                    float _yaw = dec.readFloat();
                    if (!(_yaw == yaw)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("yaw was ").appendValue(_yaw);
                    }
                    float _pitch = dec.readFloat();
                    if (!(_pitch == pitch)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pitch was ").appendValue(_pitch);
                    }
                    float _roll = dec.readFloat();
                    if (!(_roll == roll)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("roll was ").appendValue(_roll);
                    }
                }
            }
        };
    }

    public static ExpectedCmd gimbalSetTarget(final int gimbalId, final ArsdkFeatureGimbal.ControlMode controlMode, final ArsdkFeatureGimbal.FrameOfReference yawFrameOfReference, final float yaw, final ArsdkFeatureGimbal.FrameOfReference pitchFrameOfReference, final float pitch, final ArsdkFeatureGimbal.FrameOfReference rollFrameOfReference, final float roll) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == gimbalId) && (dec.readSignedInt() == controlMode.value) && (dec.readSignedInt() == yawFrameOfReference.value) && (dec.readFloat() == yaw) && (dec.readSignedInt() == pitchFrameOfReference.value) && (dec.readFloat() == pitch) && (dec.readSignedInt() == rollFrameOfReference.value) && (dec.readFloat() == roll);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37888,(short)5));
                description.appendText(", gimbalId ").appendValue(gimbalId);
                description.appendText(", controlMode ").appendValue(controlMode);
                description.appendText(", yawFrameOfReference ").appendValue(yawFrameOfReference);
                description.appendText(", yaw ").appendValue(yaw);
                description.appendText(", pitchFrameOfReference ").appendValue(pitchFrameOfReference);
                description.appendText(", pitch ").appendValue(pitch);
                description.appendText(", rollFrameOfReference ").appendValue(rollFrameOfReference);
                description.appendText(", roll ").appendValue(roll);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 5)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _gimbalId = dec.readUnsignedByte();
                    if (!(_gimbalId == gimbalId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gimbalId was ").appendValue(_gimbalId);
                    }
                    int _controlMode = dec.readSignedInt();
                    if (!(_controlMode == controlMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("controlMode was ").appendValue(ArsdkFeatureGimbal.ControlMode.fromValue(_controlMode));
                    }
                    int _yawFrameOfReference = dec.readSignedInt();
                    if (!(_yawFrameOfReference == yawFrameOfReference.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("yawFrameOfReference was ").appendValue(ArsdkFeatureGimbal.FrameOfReference.fromValue(_yawFrameOfReference));
                    }
                    float _yaw = dec.readFloat();
                    if (!(_yaw == yaw)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("yaw was ").appendValue(_yaw);
                    }
                    int _pitchFrameOfReference = dec.readSignedInt();
                    if (!(_pitchFrameOfReference == pitchFrameOfReference.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pitchFrameOfReference was ").appendValue(ArsdkFeatureGimbal.FrameOfReference.fromValue(_pitchFrameOfReference));
                    }
                    float _pitch = dec.readFloat();
                    if (!(_pitch == pitch)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pitch was ").appendValue(_pitch);
                    }
                    int _rollFrameOfReference = dec.readSignedInt();
                    if (!(_rollFrameOfReference == rollFrameOfReference.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("rollFrameOfReference was ").appendValue(ArsdkFeatureGimbal.FrameOfReference.fromValue(_rollFrameOfReference));
                    }
                    float _roll = dec.readFloat();
                    if (!(_roll == roll)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("roll was ").appendValue(_roll);
                    }
                }
            }
        };
    }

    public static ExpectedCmd gimbalSetOffsets(final int gimbalId, final float yaw, final float pitch, final float roll) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == gimbalId) && (dec.readFloat() == yaw) && (dec.readFloat() == pitch) && (dec.readFloat() == roll);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37888,(short)9));
                description.appendText(", gimbalId ").appendValue(gimbalId);
                description.appendText(", yaw ").appendValue(yaw);
                description.appendText(", pitch ").appendValue(pitch);
                description.appendText(", roll ").appendValue(roll);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 9)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _gimbalId = dec.readUnsignedByte();
                    if (!(_gimbalId == gimbalId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gimbalId was ").appendValue(_gimbalId);
                    }
                    float _yaw = dec.readFloat();
                    if (!(_yaw == yaw)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("yaw was ").appendValue(_yaw);
                    }
                    float _pitch = dec.readFloat();
                    if (!(_pitch == pitch)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("pitch was ").appendValue(_pitch);
                    }
                    float _roll = dec.readFloat();
                    if (!(_roll == roll)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("roll was ").appendValue(_roll);
                    }
                }
            }
        };
    }

    public static ExpectedCmd gimbalResetOrientation(final int gimbalId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == gimbalId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37888,(short)11));
                description.appendText(", gimbalId ").appendValue(gimbalId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 11)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _gimbalId = dec.readUnsignedByte();
                    if (!(_gimbalId == gimbalId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gimbalId was ").appendValue(_gimbalId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd gimbalStartOffsetsUpdate(final int gimbalId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == gimbalId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37888,(short)12));
                description.appendText(", gimbalId ").appendValue(gimbalId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _gimbalId = dec.readUnsignedByte();
                    if (!(_gimbalId == gimbalId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gimbalId was ").appendValue(_gimbalId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd gimbalStopOffsetsUpdate(final int gimbalId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 13)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == gimbalId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37888,(short)13));
                description.appendText(", gimbalId ").appendValue(gimbalId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 13)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _gimbalId = dec.readUnsignedByte();
                    if (!(_gimbalId == gimbalId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gimbalId was ").appendValue(_gimbalId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd gimbalCalibrate(final int gimbalId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 15)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == gimbalId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37888,(short)15));
                description.appendText(", gimbalId ").appendValue(gimbalId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 15)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _gimbalId = dec.readUnsignedByte();
                    if (!(_gimbalId == gimbalId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gimbalId was ").appendValue(_gimbalId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd gimbalCancelCalibration(final int gimbalId) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    return false;
                return !checkParams || (dec.readUnsignedByte() == gimbalId);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)37888,(short)18));
                description.appendText(", gimbalId ").appendValue(gimbalId);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 148 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _gimbalId = dec.readUnsignedByte();
                    if (!(_gimbalId == gimbalId)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("gimbalId was ").appendValue(_gimbalId);
                    }
                }
            }
        };
    }

    public static ExpectedCmd preciseHomeSetMode(final ArsdkFeaturePreciseHome.Mode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 151 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38656,(short)3));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 151 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeaturePreciseHome.Mode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalSetMode(final ArsdkFeatureThermal.Mode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38912,(short)1));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureThermal.Mode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalSetPalettePart(final float red, final float green, final float blue, final float index, final int listFlagsBitField) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    return false;
                return !checkParams || (dec.readFloat() == red) && (dec.readFloat() == green) && (dec.readFloat() == blue) && (dec.readFloat() == index) && (dec.readUnsignedByte() == listFlagsBitField);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38912,(short)4));
                description.appendText(", red ").appendValue(red);
                description.appendText(", green ").appendValue(green);
                description.appendText(", blue ").appendValue(blue);
                description.appendText(", index ").appendValue(index);
                description.appendText(", listFlagsBitField ").appendValue(listFlagsBitField);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 4)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _red = dec.readFloat();
                    if (!(_red == red)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("red was ").appendValue(_red);
                    }
                    float _green = dec.readFloat();
                    if (!(_green == green)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("green was ").appendValue(_green);
                    }
                    float _blue = dec.readFloat();
                    if (!(_blue == blue)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("blue was ").appendValue(_blue);
                    }
                    float _index = dec.readFloat();
                    if (!(_index == index)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("index was ").appendValue(_index);
                    }
                    int _listFlagsBitField = dec.readUnsignedByte();
                    if (!(_listFlagsBitField == listFlagsBitField)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("listFlagsBitField was ").appendValue(_listFlagsBitField);
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalSetPaletteSettings(final ArsdkFeatureThermal.PaletteMode mode, final float lowestTemp, final float highestTemp, final ArsdkFeatureThermal.ColorizationMode outsideColorization, final ArsdkFeatureThermal.RelativeRangeMode relativeRange, final ArsdkFeatureThermal.SpotType spotType, final float spotThreshold) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value) && (dec.readFloat() == lowestTemp) && (dec.readFloat() == highestTemp) && (dec.readSignedInt() == outsideColorization.value) && (dec.readSignedInt() == relativeRange.value) && (dec.readSignedInt() == spotType.value) && (dec.readFloat() == spotThreshold);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38912,(short)6));
                description.appendText(", mode ").appendValue(mode);
                description.appendText(", lowestTemp ").appendValue(lowestTemp);
                description.appendText(", highestTemp ").appendValue(highestTemp);
                description.appendText(", outsideColorization ").appendValue(outsideColorization);
                description.appendText(", relativeRange ").appendValue(relativeRange);
                description.appendText(", spotType ").appendValue(spotType);
                description.appendText(", spotThreshold ").appendValue(spotThreshold);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 6)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureThermal.PaletteMode.fromValue(_mode));
                    }
                    float _lowestTemp = dec.readFloat();
                    if (!(_lowestTemp == lowestTemp)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("lowestTemp was ").appendValue(_lowestTemp);
                    }
                    float _highestTemp = dec.readFloat();
                    if (!(_highestTemp == highestTemp)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("highestTemp was ").appendValue(_highestTemp);
                    }
                    int _outsideColorization = dec.readSignedInt();
                    if (!(_outsideColorization == outsideColorization.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("outsideColorization was ").appendValue(ArsdkFeatureThermal.ColorizationMode.fromValue(_outsideColorization));
                    }
                    int _relativeRange = dec.readSignedInt();
                    if (!(_relativeRange == relativeRange.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("relativeRange was ").appendValue(ArsdkFeatureThermal.RelativeRangeMode.fromValue(_relativeRange));
                    }
                    int _spotType = dec.readSignedInt();
                    if (!(_spotType == spotType.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("spotType was ").appendValue(ArsdkFeatureThermal.SpotType.fromValue(_spotType));
                    }
                    float _spotThreshold = dec.readFloat();
                    if (!(_spotThreshold == spotThreshold)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("spotThreshold was ").appendValue(_spotThreshold);
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalSetRendering(final ArsdkFeatureThermal.RenderingMode mode, final float blendingRate) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value) && (dec.readFloat() == blendingRate);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38912,(short)8));
                description.appendText(", mode ").appendValue(mode);
                description.appendText(", blendingRate ").appendValue(blendingRate);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 8)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureThermal.RenderingMode.fromValue(_mode));
                    }
                    float _blendingRate = dec.readFloat();
                    if (!(_blendingRate == blendingRate)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("blendingRate was ").appendValue(_blendingRate);
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalSetEmissivity(final float emissivity) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    return false;
                return !checkParams || (dec.readFloat() == emissivity);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38912,(short)10));
                description.appendText(", emissivity ").appendValue(emissivity);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 10)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _emissivity = dec.readFloat();
                    if (!(_emissivity == emissivity)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("emissivity was ").appendValue(_emissivity);
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalSetBackgroundTemperature(final float backgroundTemperature) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    return false;
                return !checkParams || (dec.readFloat() == backgroundTemperature);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38912,(short)12));
                description.appendText(", backgroundTemperature ").appendValue(backgroundTemperature);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 12)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _backgroundTemperature = dec.readFloat();
                    if (!(_backgroundTemperature == backgroundTemperature)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("backgroundTemperature was ").appendValue(_backgroundTemperature);
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalSetSensitivity(final ArsdkFeatureThermal.Range range) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    return false;
                return !checkParams || (dec.readSignedInt() == range.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38912,(short)14));
                description.appendText(", range ").appendValue(range);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 14)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _range = dec.readSignedInt();
                    if (!(_range == range.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("range was ").appendValue(ArsdkFeatureThermal.Range.fromValue(_range));
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalSetShutterMode(final ArsdkFeatureThermal.ShutterTrigger trigger) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    return false;
                return !checkParams || (dec.readSignedInt() == trigger.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38912,(short)16));
                description.appendText(", trigger ").appendValue(trigger);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 16)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _trigger = dec.readSignedInt();
                    if (!(_trigger == trigger.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("trigger was ").appendValue(ArsdkFeatureThermal.ShutterTrigger.fromValue(_trigger));
                    }
                }
            }
        };
    }

    public static ExpectedCmd thermalTriggShutter() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)38912,(short)18));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 152 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 18)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ledsActivate() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 154 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)39424,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 154 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd ledsDeactivate() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 154 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)39424,(short)3));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 154 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 3)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd pilotingStyleSetStyle(final ArsdkFeaturePilotingStyle.Style style) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 155 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readSignedInt() == style.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)39680,(short)2));
                description.appendText(", style ").appendValue(style);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 155 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _style = dec.readSignedInt();
                    if (!(_style == style.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("style was ").appendValue(ArsdkFeaturePilotingStyle.Style.fromValue(_style));
                    }
                }
            }
        };
    }

    public static ExpectedCmd gaugeFwUpdaterPrepare() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 160 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)40960,(short)1));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 160 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd gaugeFwUpdaterUpdate() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 160 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)40960,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 160 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd driDriMode(final ArsdkFeatureDri.Mode mode) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 164 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readSignedInt() == mode.value);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)41984,(short)2));
                description.appendText(", mode ").appendValue(mode);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 164 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    int _mode = dec.readSignedInt();
                    if (!(_mode == mode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("mode was ").appendValue(ArsdkFeatureDri.Mode.fromValue(_mode));
                    }
                }
            }
        };
    }

    public static ExpectedCmd securityEditionDeactivateLogs() {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 169 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return true;
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)43264,(short)2));
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 169 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                }
            }
        };
    }

    public static ExpectedCmd moveExtendedMoveTo(final double latitude, final double longitude, final double altitude, final ArsdkFeatureMove.OrientationMode orientationMode, final float heading, final float maxHorizontalSpeed, final float maxVerticalSpeed, final float maxYawRotationSpeed) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 170 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    return false;
                return !checkParams || (dec.readDouble() == latitude) && (dec.readDouble() == longitude) && (dec.readDouble() == altitude) && (dec.readSignedInt() == orientationMode.value) && (dec.readFloat() == heading) && (dec.readFloat() == maxHorizontalSpeed) && (dec.readFloat() == maxVerticalSpeed) && (dec.readFloat() == maxYawRotationSpeed);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)43520,(short)1));
                description.appendText(", latitude ").appendValue(latitude);
                description.appendText(", longitude ").appendValue(longitude);
                description.appendText(", altitude ").appendValue(altitude);
                description.appendText(", orientationMode ").appendValue(orientationMode);
                description.appendText(", heading ").appendValue(heading);
                description.appendText(", maxHorizontalSpeed ").appendValue(maxHorizontalSpeed);
                description.appendText(", maxVerticalSpeed ").appendValue(maxVerticalSpeed);
                description.appendText(", maxYawRotationSpeed ").appendValue(maxYawRotationSpeed);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 170 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 1)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    double _latitude = dec.readDouble();
                    if (!(_latitude == latitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("latitude was ").appendValue(_latitude);
                    }
                    double _longitude = dec.readDouble();
                    if (!(_longitude == longitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("longitude was ").appendValue(_longitude);
                    }
                    double _altitude = dec.readDouble();
                    if (!(_altitude == altitude)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("altitude was ").appendValue(_altitude);
                    }
                    int _orientationMode = dec.readSignedInt();
                    if (!(_orientationMode == orientationMode.value)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("orientationMode was ").appendValue(ArsdkFeatureMove.OrientationMode.fromValue(_orientationMode));
                    }
                    float _heading = dec.readFloat();
                    if (!(_heading == heading)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("heading was ").appendValue(_heading);
                    }
                    float _maxHorizontalSpeed = dec.readFloat();
                    if (!(_maxHorizontalSpeed == maxHorizontalSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("maxHorizontalSpeed was ").appendValue(_maxHorizontalSpeed);
                    }
                    float _maxVerticalSpeed = dec.readFloat();
                    if (!(_maxVerticalSpeed == maxVerticalSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("maxVerticalSpeed was ").appendValue(_maxVerticalSpeed);
                    }
                    float _maxYawRotationSpeed = dec.readFloat();
                    if (!(_maxYawRotationSpeed == maxYawRotationSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("maxYawRotationSpeed was ").appendValue(_maxYawRotationSpeed);
                    }
                }
            }
        };
    }

    public static ExpectedCmd moveExtendedMoveBy(final float dX, final float dY, final float dZ, final float dPsi, final float maxHorizontalSpeed, final float maxVerticalSpeed, final float maxYawRotationSpeed) {
        return new ExpectedCmd() {
            @Override
            public boolean match(ArsdkCommand cmd, boolean checkParams) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 170 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    return false;
                return !checkParams || (dec.readFloat() == dX) && (dec.readFloat() == dY) && (dec.readFloat() == dZ) && (dec.readFloat() == dPsi) && (dec.readFloat() == maxHorizontalSpeed) && (dec.readFloat() == maxVerticalSpeed) && (dec.readFloat() == maxYawRotationSpeed);
            }
            @Override
            public void describeExpected(Description description) {
                description.appendText(ArsdkCommand.getName((short)43520,(short)2));
                description.appendText(", dX ").appendValue(dX);
                description.appendText(", dY ").appendValue(dY);
                description.appendText(", dZ ").appendValue(dZ);
                description.appendText(", dPsi ").appendValue(dPsi);
                description.appendText(", maxHorizontalSpeed ").appendValue(maxHorizontalSpeed);
                description.appendText(", maxVerticalSpeed ").appendValue(maxVerticalSpeed);
                description.appendText(", maxYawRotationSpeed ").appendValue(maxYawRotationSpeed);
            }
            @Override
            public void describeMismatch(ArsdkCommand cmd, Description description) {
                ArsdkCommandDecoder dec = new ArsdkCommandDecoder(cmd);
                if (dec.readUnsignedByte() != 170 || dec.readUnsignedByte() != 0 || dec.readUnsignedShort() != 2)
                    description.appendText("was ").appendText(cmd.getName());
                else {
                    int i = 0;
                    float _dX = dec.readFloat();
                    if (!(_dX == dX)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("dX was ").appendValue(_dX);
                    }
                    float _dY = dec.readFloat();
                    if (!(_dY == dY)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("dY was ").appendValue(_dY);
                    }
                    float _dZ = dec.readFloat();
                    if (!(_dZ == dZ)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("dZ was ").appendValue(_dZ);
                    }
                    float _dPsi = dec.readFloat();
                    if (!(_dPsi == dPsi)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("dPsi was ").appendValue(_dPsi);
                    }
                    float _maxHorizontalSpeed = dec.readFloat();
                    if (!(_maxHorizontalSpeed == maxHorizontalSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("maxHorizontalSpeed was ").appendValue(_maxHorizontalSpeed);
                    }
                    float _maxVerticalSpeed = dec.readFloat();
                    if (!(_maxVerticalSpeed == maxVerticalSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("maxVerticalSpeed was ").appendValue(_maxVerticalSpeed);
                    }
                    float _maxYawRotationSpeed = dec.readFloat();
                    if (!(_maxYawRotationSpeed == maxYawRotationSpeed)) {
                        if (i++ > 0) description.appendText(", ");
                        description.appendText("maxYawRotationSpeed was ").appendValue(_maxYawRotationSpeed);
                    }
                }
            }
        };
    }

}
