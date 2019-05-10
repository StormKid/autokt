package com.stardust.autojs.core.image;

import androidx.annotation.Nullable;
import org.opencv.core.Mat;

/**
 * Created by Stardust on 2018/4/2.
 */

public class OpenCVHelper {


    private static final String LOG_TAG = "OpenCv";

    public static void release(@Nullable Mat mat) {
        if (mat == null)
            return;
        mat.release();
    }

}
