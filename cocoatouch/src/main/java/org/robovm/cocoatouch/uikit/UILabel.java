/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html">UILabel Class Reference</a>
 *   @since Available in iOS 2.0 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UILabel /*</name>*/ 
    extends /*<extends>*/ UIView /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UILabel /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UILabel /*</name>*/.class);

    /*<constructors>*/
    protected UILabel(SkipInit skipInit) { super(skipInit); }
    public UILabel() {}
    
    /*</constructors>*/
    /*<properties>*/
    
    private static final Selector adjustsFontSizeToFitWidth = Selector.register("adjustsFontSizeToFitWidth");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_isAdjustsFontSizeToFitWidth(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_isAdjustsFontSizeToFitWidthSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/adjustsFontSizeToFitWidth">@property(nonatomic) BOOL adjustsFontSizeToFitWidth</a>
     * @since Available in iOS 2.0 and later.
     */
    public boolean isAdjustsFontSizeToFitWidth() {
        if (customClass) { return objc_isAdjustsFontSizeToFitWidthSuper(getSuper(), this, adjustsFontSizeToFitWidth); } else { return objc_isAdjustsFontSizeToFitWidth(this, adjustsFontSizeToFitWidth); }
    }
    
    private static final Selector setAdjustsFontSizeToFitWidth$ = Selector.register("setAdjustsFontSizeToFitWidth:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setAdjustsFontSizeToFitWidth(UILabel __self__, Selector __cmd__, boolean adjustsFontSizeToFitWidth);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setAdjustsFontSizeToFitWidthSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, boolean adjustsFontSizeToFitWidth);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/adjustsFontSizeToFitWidth">@property(nonatomic) BOOL adjustsFontSizeToFitWidth</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setAdjustsFontSizeToFitWidth(boolean adjustsFontSizeToFitWidth) {
        if (customClass) { objc_setAdjustsFontSizeToFitWidthSuper(getSuper(), this, setAdjustsFontSizeToFitWidth$, adjustsFontSizeToFitWidth); } else { objc_setAdjustsFontSizeToFitWidth(this, setAdjustsFontSizeToFitWidth$, adjustsFontSizeToFitWidth); }
    }
    
    private static final Selector adjustsLetterSpacingToFitWidth = Selector.register("adjustsLetterSpacingToFitWidth");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_isAdjustsLetterSpacingToFitWidth(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_isAdjustsLetterSpacingToFitWidthSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/adjustsLetterSpacingToFitWidth">@property(nonatomic) BOOL adjustsLetterSpacingToFitWidth</a>
     * @since Available in iOS 6.0 and later.
     */
    public boolean isAdjustsLetterSpacingToFitWidth() {
        if (customClass) { return objc_isAdjustsLetterSpacingToFitWidthSuper(getSuper(), this, adjustsLetterSpacingToFitWidth); } else { return objc_isAdjustsLetterSpacingToFitWidth(this, adjustsLetterSpacingToFitWidth); }
    }
    
    private static final Selector setAdjustsLetterSpacingToFitWidth$ = Selector.register("setAdjustsLetterSpacingToFitWidth:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setAdjustsLetterSpacingToFitWidth(UILabel __self__, Selector __cmd__, boolean adjustsLetterSpacingToFitWidth);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setAdjustsLetterSpacingToFitWidthSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, boolean adjustsLetterSpacingToFitWidth);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/adjustsLetterSpacingToFitWidth">@property(nonatomic) BOOL adjustsLetterSpacingToFitWidth</a>
     * @since Available in iOS 6.0 and later.
     */
    public void setAdjustsLetterSpacingToFitWidth(boolean adjustsLetterSpacingToFitWidth) {
        if (customClass) { objc_setAdjustsLetterSpacingToFitWidthSuper(getSuper(), this, setAdjustsLetterSpacingToFitWidth$, adjustsLetterSpacingToFitWidth); } else { objc_setAdjustsLetterSpacingToFitWidth(this, setAdjustsLetterSpacingToFitWidth$, adjustsLetterSpacingToFitWidth); }
    }
    
    private static final Selector attributedText = Selector.register("attributedText");
    @Bridge(symbol = "objc_msgSend") private native static NSAttributedString objc_getAttributedText(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSAttributedString objc_getAttributedTextSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/attributedText">@property(nonatomic,copy) NSAttributedString *attributedText</a>
     * @since Available in iOS 6.0 and later.
     */
    public NSAttributedString getAttributedText() {
        if (customClass) { return objc_getAttributedTextSuper(getSuper(), this, attributedText); } else { return objc_getAttributedText(this, attributedText); }
    }
    
    private static final Selector setAttributedText$ = Selector.register("setAttributedText:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setAttributedText(UILabel __self__, Selector __cmd__, NSAttributedString attributedText);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setAttributedTextSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, NSAttributedString attributedText);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/attributedText">@property(nonatomic,copy) NSAttributedString *attributedText</a>
     * @since Available in iOS 6.0 and later.
     */
    public void setAttributedText(NSAttributedString attributedText) {
        if (customClass) { objc_setAttributedTextSuper(getSuper(), this, setAttributedText$, attributedText); } else { objc_setAttributedText(this, setAttributedText$, attributedText); }
    }
    
    private static final Selector baselineAdjustment = Selector.register("baselineAdjustment");
    @Bridge(symbol = "objc_msgSend") private native static UIBaselineAdjustment objc_getBaselineAdjustment(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UIBaselineAdjustment objc_getBaselineAdjustmentSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/baselineAdjustment">@property(nonatomic) UIBaselineAdjustment baselineAdjustment</a>
     * @since Available in iOS 2.0 and later.
     */
    public UIBaselineAdjustment getBaselineAdjustment() {
        if (customClass) { return objc_getBaselineAdjustmentSuper(getSuper(), this, baselineAdjustment); } else { return objc_getBaselineAdjustment(this, baselineAdjustment); }
    }
    
    private static final Selector setBaselineAdjustment$ = Selector.register("setBaselineAdjustment:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setBaselineAdjustment(UILabel __self__, Selector __cmd__, UIBaselineAdjustment baselineAdjustment);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setBaselineAdjustmentSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, UIBaselineAdjustment baselineAdjustment);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/baselineAdjustment">@property(nonatomic) UIBaselineAdjustment baselineAdjustment</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setBaselineAdjustment(UIBaselineAdjustment baselineAdjustment) {
        if (customClass) { objc_setBaselineAdjustmentSuper(getSuper(), this, setBaselineAdjustment$, baselineAdjustment); } else { objc_setBaselineAdjustment(this, setBaselineAdjustment$, baselineAdjustment); }
    }
    
    private static final Selector isEnabled = Selector.register("isEnabled");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_isEnabled(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_isEnabledSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/enabled">@property(nonatomic, getter=isEnabled) BOOL enabled</a>
     * @since Available in iOS 2.0 and later.
     */
    public boolean isEnabled() {
        if (customClass) { return objc_isEnabledSuper(getSuper(), this, isEnabled); } else { return objc_isEnabled(this, isEnabled); }
    }
    
    private static final Selector setEnabled$ = Selector.register("setEnabled:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setEnabled(UILabel __self__, Selector __cmd__, boolean enabled);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setEnabledSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, boolean enabled);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/enabled">@property(nonatomic, getter=isEnabled) BOOL enabled</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setEnabled(boolean enabled) {
        if (customClass) { objc_setEnabledSuper(getSuper(), this, setEnabled$, enabled); } else { objc_setEnabled(this, setEnabled$, enabled); }
    }
    
    private static final Selector font = Selector.register("font");
    @Bridge(symbol = "objc_msgSend") private native static UIFont objc_getFont(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UIFont objc_getFontSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/font">@property(nonatomic, retain) UIFont *font</a>
     * @since Available in iOS 2.0 and later.
     */
    public UIFont getFont() {
        if (customClass) { return objc_getFontSuper(getSuper(), this, font); } else { return objc_getFont(this, font); }
    }
    
    private static final Selector setFont$ = Selector.register("setFont:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setFont(UILabel __self__, Selector __cmd__, UIFont font);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setFontSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, UIFont font);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/font">@property(nonatomic, retain) UIFont *font</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setFont(UIFont font) {
        if (customClass) { objc_setFontSuper(getSuper(), this, setFont$, font); } else { objc_setFont(this, setFont$, font); }
    }
    
    private static final Selector isHighlighted = Selector.register("isHighlighted");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_isHighlighted(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_isHighlightedSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/highlighted">@property(nonatomic, getter=isHighlighted) BOOL highlighted</a>
     * @since Available in iOS 2.0 and later.
     */
    public boolean isHighlighted() {
        if (customClass) { return objc_isHighlightedSuper(getSuper(), this, isHighlighted); } else { return objc_isHighlighted(this, isHighlighted); }
    }
    
    private static final Selector setHighlighted$ = Selector.register("setHighlighted:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setHighlighted(UILabel __self__, Selector __cmd__, boolean highlighted);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setHighlightedSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, boolean highlighted);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/highlighted">@property(nonatomic, getter=isHighlighted) BOOL highlighted</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setHighlighted(boolean highlighted) {
        if (customClass) { objc_setHighlightedSuper(getSuper(), this, setHighlighted$, highlighted); } else { objc_setHighlighted(this, setHighlighted$, highlighted); }
    }
    
    private static final Selector highlightedTextColor = Selector.register("highlightedTextColor");
    @Bridge(symbol = "objc_msgSend") private native static UIColor objc_getHighlightedTextColor(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UIColor objc_getHighlightedTextColorSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/highlightedTextColor">@property(nonatomic, retain) UIColor *highlightedTextColor</a>
     * @since Available in iOS 2.0 and later.
     */
    public UIColor getHighlightedTextColor() {
        if (customClass) { return objc_getHighlightedTextColorSuper(getSuper(), this, highlightedTextColor); } else { return objc_getHighlightedTextColor(this, highlightedTextColor); }
    }
    
    private static final Selector setHighlightedTextColor$ = Selector.register("setHighlightedTextColor:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setHighlightedTextColor(UILabel __self__, Selector __cmd__, UIColor highlightedTextColor);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setHighlightedTextColorSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, UIColor highlightedTextColor);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/highlightedTextColor">@property(nonatomic, retain) UIColor *highlightedTextColor</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setHighlightedTextColor(UIColor highlightedTextColor) {
        if (customClass) { objc_setHighlightedTextColorSuper(getSuper(), this, setHighlightedTextColor$, highlightedTextColor); } else { objc_setHighlightedTextColor(this, setHighlightedTextColor$, highlightedTextColor); }
    }
    
    private static final Selector lineBreakMode = Selector.register("lineBreakMode");
    @Bridge(symbol = "objc_msgSend") private native static NSLineBreakMode objc_getLineBreakMode(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSLineBreakMode objc_getLineBreakModeSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/lineBreakMode">@property(nonatomic) NSLineBreakMode lineBreakMode</a>
     * @since Available in iOS 2.0 and later.
     */
    public NSLineBreakMode getLineBreakMode() {
        if (customClass) { return objc_getLineBreakModeSuper(getSuper(), this, lineBreakMode); } else { return objc_getLineBreakMode(this, lineBreakMode); }
    }
    
    private static final Selector setLineBreakMode$ = Selector.register("setLineBreakMode:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setLineBreakMode(UILabel __self__, Selector __cmd__, NSLineBreakMode lineBreakMode);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setLineBreakModeSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, NSLineBreakMode lineBreakMode);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/lineBreakMode">@property(nonatomic) NSLineBreakMode lineBreakMode</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setLineBreakMode(NSLineBreakMode lineBreakMode) {
        if (customClass) { objc_setLineBreakModeSuper(getSuper(), this, setLineBreakMode$, lineBreakMode); } else { objc_setLineBreakMode(this, setLineBreakMode$, lineBreakMode); }
    }
    
    private static final Selector minimumScaleFactor = Selector.register("minimumScaleFactor");
    @Bridge(symbol = "objc_msgSend") private native static float objc_getMinimumScaleFactor(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static float objc_getMinimumScaleFactorSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/minimumScaleFactor">@property(nonatomic) CGFloat minimumScaleFactor</a>
     * @since Available in iOS 6.0 and later.
     */
    public float getMinimumScaleFactor() {
        if (customClass) { return objc_getMinimumScaleFactorSuper(getSuper(), this, minimumScaleFactor); } else { return objc_getMinimumScaleFactor(this, minimumScaleFactor); }
    }
    
    private static final Selector setMinimumScaleFactor$ = Selector.register("setMinimumScaleFactor:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setMinimumScaleFactor(UILabel __self__, Selector __cmd__, float minimumScaleFactor);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setMinimumScaleFactorSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, float minimumScaleFactor);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/minimumScaleFactor">@property(nonatomic) CGFloat minimumScaleFactor</a>
     * @since Available in iOS 6.0 and later.
     */
    public void setMinimumScaleFactor(float minimumScaleFactor) {
        if (customClass) { objc_setMinimumScaleFactorSuper(getSuper(), this, setMinimumScaleFactor$, minimumScaleFactor); } else { objc_setMinimumScaleFactor(this, setMinimumScaleFactor$, minimumScaleFactor); }
    }
    
    private static final Selector numberOfLines = Selector.register("numberOfLines");
    @Bridge(symbol = "objc_msgSend") private native static int objc_getNumberOfLines(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static int objc_getNumberOfLinesSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/numberOfLines">@property(nonatomic) NSInteger numberOfLines</a>
     * @since Available in iOS 2.0 and later.
     */
    public int getNumberOfLines() {
        if (customClass) { return objc_getNumberOfLinesSuper(getSuper(), this, numberOfLines); } else { return objc_getNumberOfLines(this, numberOfLines); }
    }
    
    private static final Selector setNumberOfLines$ = Selector.register("setNumberOfLines:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setNumberOfLines(UILabel __self__, Selector __cmd__, int numberOfLines);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setNumberOfLinesSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, int numberOfLines);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/numberOfLines">@property(nonatomic) NSInteger numberOfLines</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setNumberOfLines(int numberOfLines) {
        if (customClass) { objc_setNumberOfLinesSuper(getSuper(), this, setNumberOfLines$, numberOfLines); } else { objc_setNumberOfLines(this, setNumberOfLines$, numberOfLines); }
    }
    
    private static final Selector preferredMaxLayoutWidth = Selector.register("preferredMaxLayoutWidth");
    @Bridge(symbol = "objc_msgSend") private native static float objc_getPreferredMaxLayoutWidth(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static float objc_getPreferredMaxLayoutWidthSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/preferredMaxLayoutWidth">@property(nonatomic) CGFloat preferredMaxLayoutWidth</a>
     * @since Available in iOS 6.0 and later.
     */
    public float getPreferredMaxLayoutWidth() {
        if (customClass) { return objc_getPreferredMaxLayoutWidthSuper(getSuper(), this, preferredMaxLayoutWidth); } else { return objc_getPreferredMaxLayoutWidth(this, preferredMaxLayoutWidth); }
    }
    
    private static final Selector setPreferredMaxLayoutWidth$ = Selector.register("setPreferredMaxLayoutWidth:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setPreferredMaxLayoutWidth(UILabel __self__, Selector __cmd__, float preferredMaxLayoutWidth);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setPreferredMaxLayoutWidthSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, float preferredMaxLayoutWidth);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/preferredMaxLayoutWidth">@property(nonatomic) CGFloat preferredMaxLayoutWidth</a>
     * @since Available in iOS 6.0 and later.
     */
    public void setPreferredMaxLayoutWidth(float preferredMaxLayoutWidth) {
        if (customClass) { objc_setPreferredMaxLayoutWidthSuper(getSuper(), this, setPreferredMaxLayoutWidth$, preferredMaxLayoutWidth); } else { objc_setPreferredMaxLayoutWidth(this, setPreferredMaxLayoutWidth$, preferredMaxLayoutWidth); }
    }
    
    private static final Selector shadowColor = Selector.register("shadowColor");
    @Bridge(symbol = "objc_msgSend") private native static UIColor objc_getShadowColor(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UIColor objc_getShadowColorSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/shadowColor">@property(nonatomic, retain) UIColor *shadowColor</a>
     * @since Available in iOS 2.0 and later.
     */
    public UIColor getShadowColor() {
        if (customClass) { return objc_getShadowColorSuper(getSuper(), this, shadowColor); } else { return objc_getShadowColor(this, shadowColor); }
    }
    
    private static final Selector setShadowColor$ = Selector.register("setShadowColor:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setShadowColor(UILabel __self__, Selector __cmd__, UIColor shadowColor);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setShadowColorSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, UIColor shadowColor);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/shadowColor">@property(nonatomic, retain) UIColor *shadowColor</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setShadowColor(UIColor shadowColor) {
        if (customClass) { objc_setShadowColorSuper(getSuper(), this, setShadowColor$, shadowColor); } else { objc_setShadowColor(this, setShadowColor$, shadowColor); }
    }
    
    private static final Selector shadowOffset = Selector.register("shadowOffset");
    @Bridge(symbol = "objc_msgSend") private native static CGSize objc_getShadowOffset(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static CGSize objc_getShadowOffsetSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/shadowOffset">@property(nonatomic) CGSize shadowOffset</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGSize getShadowOffset() {
        if (customClass) { return objc_getShadowOffsetSuper(getSuper(), this, shadowOffset); } else { return objc_getShadowOffset(this, shadowOffset); }
    }
    
    private static final Selector setShadowOffset$ = Selector.register("setShadowOffset:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setShadowOffset(UILabel __self__, Selector __cmd__, CGSize shadowOffset);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setShadowOffsetSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, CGSize shadowOffset);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/shadowOffset">@property(nonatomic) CGSize shadowOffset</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setShadowOffset(CGSize shadowOffset) {
        if (customClass) { objc_setShadowOffsetSuper(getSuper(), this, setShadowOffset$, shadowOffset); } else { objc_setShadowOffset(this, setShadowOffset$, shadowOffset); }
    }
    
    private static final Selector text = Selector.register("text");
    @Bridge(symbol = "objc_msgSend") private native static String objc_getText(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static String objc_getTextSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/text">@property(nonatomic, copy) NSString *text</a>
     * @since Available in iOS 2.0 and later.
     */
    public String getText() {
        if (customClass) { return objc_getTextSuper(getSuper(), this, text); } else { return objc_getText(this, text); }
    }
    
    private static final Selector setText$ = Selector.register("setText:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setText(UILabel __self__, Selector __cmd__, String text);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setTextSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, String text);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/text">@property(nonatomic, copy) NSString *text</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setText(String text) {
        if (customClass) { objc_setTextSuper(getSuper(), this, setText$, text); } else { objc_setText(this, setText$, text); }
    }
    
    private static final Selector textAlignment = Selector.register("textAlignment");
    @Bridge(symbol = "objc_msgSend") private native static NSTextAlignment objc_getTextAlignment(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSTextAlignment objc_getTextAlignmentSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/textAlignment">@property(nonatomic) NSTextAlignment textAlignment</a>
     * @since Available in iOS 2.0 and later.
     */
    public NSTextAlignment getTextAlignment() {
        if (customClass) { return objc_getTextAlignmentSuper(getSuper(), this, textAlignment); } else { return objc_getTextAlignment(this, textAlignment); }
    }
    
    private static final Selector setTextAlignment$ = Selector.register("setTextAlignment:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setTextAlignment(UILabel __self__, Selector __cmd__, NSTextAlignment textAlignment);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setTextAlignmentSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, NSTextAlignment textAlignment);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/textAlignment">@property(nonatomic) NSTextAlignment textAlignment</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setTextAlignment(NSTextAlignment textAlignment) {
        if (customClass) { objc_setTextAlignmentSuper(getSuper(), this, setTextAlignment$, textAlignment); } else { objc_setTextAlignment(this, setTextAlignment$, textAlignment); }
    }
    
    private static final Selector textColor = Selector.register("textColor");
    @Bridge(symbol = "objc_msgSend") private native static UIColor objc_getTextColor(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UIColor objc_getTextColorSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/textColor">@property(nonatomic, retain) UIColor *textColor</a>
     * @since Available in iOS 2.0 and later.
     */
    public UIColor getTextColor() {
        if (customClass) { return objc_getTextColorSuper(getSuper(), this, textColor); } else { return objc_getTextColor(this, textColor); }
    }
    
    private static final Selector setTextColor$ = Selector.register("setTextColor:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setTextColor(UILabel __self__, Selector __cmd__, UIColor textColor);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setTextColorSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, UIColor textColor);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/textColor">@property(nonatomic, retain) UIColor *textColor</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setTextColor(UIColor textColor) {
        if (customClass) { objc_setTextColorSuper(getSuper(), this, setTextColor$, textColor); } else { objc_setTextColor(this, setTextColor$, textColor); }
    }
    
    private static final Selector isUserInteractionEnabled = Selector.register("isUserInteractionEnabled");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_isUserInteractionEnabled(UILabel __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_isUserInteractionEnabledSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/userInteractionEnabled">@property(nonatomic, getter=isUserInteractionEnabled) BOOL userInteractionEnabled</a>
     * @since Available in iOS 2.0 and later.
     */
    public boolean isUserInteractionEnabled() {
        if (customClass) { return objc_isUserInteractionEnabledSuper(getSuper(), this, isUserInteractionEnabled); } else { return objc_isUserInteractionEnabled(this, isUserInteractionEnabled); }
    }
    
    private static final Selector setUserInteractionEnabled$ = Selector.register("setUserInteractionEnabled:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setUserInteractionEnabled(UILabel __self__, Selector __cmd__, boolean userInteractionEnabled);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setUserInteractionEnabledSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, boolean userInteractionEnabled);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instp/UILabel/userInteractionEnabled">@property(nonatomic, getter=isUserInteractionEnabled) BOOL userInteractionEnabled</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setUserInteractionEnabled(boolean userInteractionEnabled) {
        if (customClass) { objc_setUserInteractionEnabledSuper(getSuper(), this, setUserInteractionEnabled$, userInteractionEnabled); } else { objc_setUserInteractionEnabled(this, setUserInteractionEnabled$, userInteractionEnabled); }
    }
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector drawTextInRect$ = Selector.register("drawTextInRect:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_drawText(UILabel __self__, Selector __cmd__, CGRect rect);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_drawTextSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, CGRect rect);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instm/UILabel/drawTextInRect:">- (void)drawTextInRect:(CGRect)rect</a>
     * @since Available in iOS 2.0 and later.
     */
    public void drawText(CGRect rect) {
        if (customClass) { objc_drawTextSuper(getSuper(), this, drawTextInRect$, rect); } else { objc_drawText(this, drawTextInRect$, rect); }
    }
    
    private static final Selector textRectForBounds$limitedToNumberOfLines$ = Selector.register("textRectForBounds:limitedToNumberOfLines:");
    @Bridge(symbol = "objc_msgSend") private native static CGRect objc_getTextRect(UILabel __self__, Selector __cmd__, CGRect bounds, int numberOfLines);
    @Bridge(symbol = "objc_msgSendSuper") private native static CGRect objc_getTextRectSuper(ObjCSuper __super__, UILabel __self__, Selector __cmd__, CGRect bounds, int numberOfLines);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UILabel_Class/Reference/UILabel.html#//apple_ref/occ/instm/UILabel/textRectForBounds:limitedToNumberOfLines:">- (CGRect)textRectForBounds:(CGRect)bounds limitedToNumberOfLines:(NSInteger)numberOfLines</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGRect getTextRect(CGRect bounds, int numberOfLines) {
        if (customClass) { return objc_getTextRectSuper(getSuper(), this, textRectForBounds$limitedToNumberOfLines$, bounds, numberOfLines); } else { return objc_getTextRect(this, textRectForBounds$limitedToNumberOfLines$, bounds, numberOfLines); }
    }
    /*</methods>*/
    /*<callbacks>*/
    static class Callbacks {
        @Callback @BindSelector("drawTextInRect:") public static void drawText(UILabel __self__, Selector __cmd__, CGRect rect) { __self__.drawText(rect); }
        @Callback @BindSelector("textRectForBounds:limitedToNumberOfLines:") public static CGRect getTextRect(UILabel __self__, Selector __cmd__, CGRect bounds, int numberOfLines) { return __self__.getTextRect(bounds, numberOfLines); }
    }
    /*</callbacks>*/

}