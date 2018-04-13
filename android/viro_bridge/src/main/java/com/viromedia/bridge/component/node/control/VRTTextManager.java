/**
 * Copyright © 2016 Viro Media. All rights reserved.
 */
package com.viromedia.bridge.component.node.control;

import android.graphics.Color;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.viromedia.bridge.component.node.VRTNodeManager;
import com.viromedia.bridge.utility.ViroEvents;

import java.util.Map;

import javax.annotation.Nullable;

public class VRTTextManager extends VRTNodeManager<VRTText> {
    public VRTTextManager(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "VRTText";
    }

    @Override
    protected VRTText createViewInstance(ThemedReactContext reactContext) {
        return new VRTText(reactContext);
    }

    @ReactProp(name = "width", defaultFloat = VRTText.DEFAULT_WIDTH)
    public void setWidth(VRTText text, float width) {
        text.setWidth(width);
    }

    @ReactProp(name = "height", defaultFloat = VRTText.DEFAULT_HEIGHT)
    public void setHeight(VRTText text, float height) {
        text.setHeight(height);
    }

    @ReactProp(name = "text")
    public void setText(VRTText text, String textString) {
        text.setText(textString);
    }

    @ReactProp(name = "color", customType = "Color")
    public void setColor(VRTText text, @Nullable Integer color) {
        if(color == null) {
            text.setColor(Color.WHITE);
        } else {
            text.setColor(color);
        }
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(VRTText text, String fontFamily) {
        text.setFontFamilyName(fontFamily);
    }

    @ReactProp(name = "fontSize", defaultInt = VRTText.DEFAULT_FONT_SIZE)
    public void setFontSize(VRTText text, int size) {
        text.setSize(size);
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(VRTText text, String fontStyle) {
        text.setFontStyle(fontStyle);
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(VRTText text, String fontWeight) {
        text.setFontWeight(fontWeight);
    }

    @ReactProp(name = "maxLines", defaultInt = VRTText.DEFAULT_MAX_LINES)
    public void setMaxLines(VRTText text, int maxLines) {
        text.setMaxLines(maxLines);
    }

    @ReactProp(name = "textClipMode")
    public void setTextClipMode(VRTText text, String textClipMode) {
        text.setTextClipMode(textClipMode);
    }

    @ReactProp(name = "textAlign")
    public void setHorizontalAlignment(VRTText text, String textAlign) {
        text.setHorizontalAlignment(textAlign);
    }

    @ReactProp(name = "textAlignVertical")
    public void setVerticalAlignment(VRTText text, String textAlignVertical) {
        text.setVerticalAlignment(textAlignVertical);
    }

    @ReactProp(name = "textLineBreakMode")
    public void setTextLineBreakMode(VRTText text, String textLineBreakMode) {
        text.setTextLineBreakMode(textLineBreakMode);
    }

    @ReactProp(name = "lightReceivingBitMask", defaultInt = 1)
    public void setLightReceivingBitMask(VRTText text, int bitMask) {text.setLightReceivingBitMask(bitMask); }

    @ReactProp(name = "shadowCastingBitMask", defaultInt = 1)
    public void setShadowCastingBitMask(VRTText text, int bitMask) {text.setShadowCastingBitMask(bitMask); }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(
                ViroEvents.ON_ANIMATION_START, MapBuilder.of("registrationName", ViroEvents.ON_ANIMATION_START),
                ViroEvents.ON_ANIMATION_FINISH, MapBuilder.of("registrationName", ViroEvents.ON_ANIMATION_FINISH));
    }

}
