/**
 *    Copyright 2013 CITYTECH, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.citytechinc.cq.component.touchuidialog.widget.factory;

import com.citytechinc.cq.component.touchuidialog.TouchUIDialogElement;
import com.citytechinc.cq.component.touchuidialog.widget.maker.TouchUIWidgetMaker;
import com.citytechinc.cq.component.touchuidialog.widget.maker.TouchUIWidgetMakerParameters;
import com.citytechinc.cq.component.touchuidialog.widget.textfield.TextFieldWidgetMaker;

public class TouchUIWidgetFactory {

    public static TouchUIDialogElement make(TouchUIWidgetMakerParameters widgetMakerParameters, int rankingCeiling) {
        TouchUIWidgetMaker widgetMaker = new TextFieldWidgetMaker(widgetMakerParameters);

        return widgetMaker.make();
    }
}
