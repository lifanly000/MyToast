package es.dmoral.toasty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.CheckResult;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This file is part of Toasty.
 *
 * Toasty is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Toasty is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Toasty.  If not, see <http://www.gnu.org/licenses/>.
 */

@SuppressLint("InflateParams")
public class Toasty {
    private static final @ColorInt int DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");

    private static final @ColorInt int ERROR_COLOR = Color.parseColor("#D50000");
    private static final @ColorInt int INFO_COLOR = Color.parseColor("#3F51B5");
    private static final @ColorInt int SUCCESS_COLOR = Color.parseColor("#388E3C");
    private static final @ColorInt int WARNING_COLOR = Color.parseColor("#FFA900");

    private static final String TOAST_TYPEFACE = "sans-serif-condensed";

    public static final int TOASTY_VERTICAL = 1001;
    public static final int TOASTY_HORIZONTAL = 1002;

    private Toasty() {
    }

    public static @CheckResult Toast normal(@NonNull Context context, @NonNull String message) {
        return normal(context, message, Toast.LENGTH_SHORT, null, false,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast normal(@NonNull Context context, @NonNull String message, Drawable icon) {
        return normal(context, message, Toast.LENGTH_SHORT, icon, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast normal(@NonNull Context context, @NonNull String message, int duration) {
        return normal(context, message, duration, null, false,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast normal(@NonNull Context context, @NonNull String message, int duration,
                               Drawable icon) {
        return normal(context, message, duration, icon, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast normal(@NonNull Context context, @NonNull String message, int duration,
                                            Drawable icon, boolean withIcon) {
        return custom(context, message, icon, DEFAULT_TEXT_COLOR, duration, withIcon,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast normal(@NonNull Context context, @NonNull String message, int duration,
                               Drawable icon, boolean withIcon,int gravity,int horizonMode) {
        return custom(context, message, icon, DEFAULT_TEXT_COLOR, duration, withIcon,gravity,horizonMode);
    }

    public static @CheckResult Toast warning(@NonNull Context context, @NonNull String message) {
        return warning(context, message, Toast.LENGTH_SHORT, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast warning(@NonNull Context context, @NonNull String message, int duration) {
        return warning(context, message, duration, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast warning(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_error_outline_white_48dp),
                DEFAULT_TEXT_COLOR, WARNING_COLOR, duration, withIcon, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast warning(@NonNull Context context, @NonNull String message, int duration, boolean withIcon,int gravity,int horizonMode) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_error_outline_white_48dp),
                DEFAULT_TEXT_COLOR, WARNING_COLOR, duration, withIcon, true,gravity,horizonMode);
    }

    public static @CheckResult Toast info(@NonNull Context context, @NonNull String message) {
        return info(context, message, Toast.LENGTH_SHORT, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast info(@NonNull Context context, @NonNull String message, int duration) {
        return info(context, message, duration, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast info(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_info_outline_white_48dp),
                DEFAULT_TEXT_COLOR, INFO_COLOR, duration, withIcon, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast info(@NonNull Context context, @NonNull String message, int duration, boolean withIcon,int gravity,int horizonMode) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_info_outline_white_48dp),
                DEFAULT_TEXT_COLOR, INFO_COLOR, duration, withIcon, true,gravity,horizonMode);
    }

    public static @CheckResult Toast success(@NonNull Context context, @NonNull String message) {
        return success(context, message, Toast.LENGTH_SHORT, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast success(@NonNull Context context, @NonNull String message, int duration) {
        return success(context, message, duration, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast success(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_check_white_48dp),
                DEFAULT_TEXT_COLOR, SUCCESS_COLOR, duration, withIcon, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast success(@NonNull Context context, @NonNull String message, int duration, boolean withIcon,int gravity,int horizonMode) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_check_white_48dp),
                DEFAULT_TEXT_COLOR, SUCCESS_COLOR, duration, withIcon, true,gravity,horizonMode);
    }

    public static @CheckResult Toast error(@NonNull Context context, @NonNull String message) {
        return error(context, message, Toast.LENGTH_SHORT, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast error(@NonNull Context context, @NonNull String message, int duration) {
        return error(context, message, duration, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast error(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_clear_white_48dp),
                DEFAULT_TEXT_COLOR, ERROR_COLOR, duration, withIcon, true,-1,TOASTY_HORIZONTAL);
    }

    public static @CheckResult Toast error(@NonNull Context context, @NonNull String message, int duration, boolean withIcon,int gravity,int horizonMode) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_clear_white_48dp),
                DEFAULT_TEXT_COLOR, ERROR_COLOR, duration, withIcon, true,gravity,horizonMode);
    }

    public static @CheckResult Toast custom(@NonNull Context context, @NonNull String message, Drawable icon,
                               @ColorInt int textColor, int duration, boolean withIcon,int gravity,int horizonMode) {
        return custom(context, message, icon, textColor, -1, duration, withIcon, false,gravity,horizonMode);
    }

    public static @CheckResult Toast custom(@NonNull Context context, @NonNull String message, @DrawableRes int iconRes,
                               @ColorInt int textColor, @ColorInt int tintColor, int duration,
                               boolean withIcon, boolean shouldTint,int gravity,int horizonMode) {
        return custom(context, message, ToastyUtils.getDrawable(context, iconRes), textColor,
                tintColor, duration, withIcon, shouldTint,gravity,horizonMode);
    }

    /**
     *
     * @param context           context
     * @param message           message
     * @param icon              your icon
     * @param textColor         textColor
     * @param tintColor         backGround Color
     * @param duration          time duration
     * @param withIcon          true : your own icon   false : default icon
     * @param shouldTint        true : your tint       false : defalt tint
     * @param gravity           locaiton :Gravity.Center /  Gravity.Bottom   and so on .
     * @param horizonMode       The relative position of ICONS and text:  Toasty.TOASTY_VERTICAL / Toasty.TOASTY_HORIZONTAL
     * @return
     */
    public static @CheckResult Toast custom(@NonNull Context context, @NonNull String message, Drawable icon,
                               @ColorInt int textColor, @ColorInt int tintColor, int duration,
                               boolean withIcon, boolean shouldTint,int gravity,int horizonMode) {
        final Toast currentToast = new Toast(context);
        int layout = 0;
        if(horizonMode == TOASTY_VERTICAL){
            layout = R.layout.toast_vertical_layout;
        }else{
            layout = R.layout.toast_layout;
        }
        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(layout, null);
        final ImageView toastIcon = (ImageView) toastLayout.findViewById(R.id.toast_icon);
        final TextView toastTextView = (TextView) toastLayout.findViewById(R.id.toast_text);
        Drawable drawableFrame;

        if (shouldTint)
            drawableFrame = ToastyUtils.tint9PatchDrawableFrame(context, tintColor);
        else
            drawableFrame = ToastyUtils.getDrawable(context, R.drawable.toast_frame);
        ToastyUtils.setBackground(toastLayout, drawableFrame);

        if (withIcon) {
            if (icon == null)
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            ToastyUtils.setBackground(toastIcon, icon);
        } else
            toastIcon.setVisibility(View.GONE);

        toastTextView.setTextColor(textColor);
        toastTextView.setText(message);
        toastTextView.setTypeface(Typeface.create(TOAST_TYPEFACE, Typeface.NORMAL));

        currentToast.setView(toastLayout);
        if(gravity !=-1) {
            currentToast.setGravity(gravity,0,0);
        }
        currentToast.setDuration(duration);
        return currentToast;
    }
}
