package com.mrwang.switchbutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnCheckedChangeListener {

    private SwitchButton mMsgNotifySwitch;
    private SwitchButton mMsgSoundSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

    }

    private void initUI() {
        mMsgNotifySwitch = (SwitchButton)findViewById(R.id.message_notify_switch);
        mMsgSoundSwitch = (SwitchButton)findViewById(R.id.message_sound_switch);
        mMsgNotifySwitch.setOnCheckedChangeListener(this);
        mMsgSoundSwitch.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.message_notify_switch:
                if (isChecked) {
                    Toast.makeText(this, "新消息提醒打开", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "新消息提醒关闭", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.message_sound_switch:
                if (isChecked) {
                    Toast.makeText(this, "声音提醒打开", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "声音提醒关闭", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }

    }
}
