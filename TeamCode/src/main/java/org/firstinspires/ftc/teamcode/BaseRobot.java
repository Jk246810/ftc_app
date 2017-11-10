package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by andrew on Oct 31, 2017 as part of ftc_app in org.firstinspires.ftc.teamcode.
 */

public class BaseRobot extends OpMode {

    public DcMotor left_drive, right_drive, left_lift, right_lift, left_intake, right_intake;
    public ElapsedTime timer;

    @Override
    public void init() {
        left_drive = hardwareMap.get(DcMotor.class, "left_drive");
        right_drive = hardwareMap.get(DcMotor.class, "right_drive");
        left_lift = hardwareMap.get(DcMotor.class, "left_lift");
        right_lift = hardwareMap.get(DcMotor.class, "right_lift");
        left_intake = hardwareMap.get(DcMotor.class, "left_intake");
        right_intake = hardwareMap.get(DcMotor.class, "right_intake");

        right_drive.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void start() {
        timer.reset();
    }

    @Override
    public void loop() {

    }
}
