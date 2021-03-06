package com.thecraicers.util;

import com.thecraicers.constants.AppConstant;
import com.thecraicers.model.Ride;

public class ScoreUtil {

    public static Integer getScore(Ride ride, boolean isExactlyOnTIme) {
        Integer distance = ride.getDistance();

        if (isExactlyOnTIme) {
            return distance + AppConstant.getPerRideBonus();
        }

        return distance;
    }
}
