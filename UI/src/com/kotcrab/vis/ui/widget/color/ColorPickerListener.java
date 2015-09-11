/*
 * Copyright 2014-2015 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.ui.widget.color;

import com.badlogic.gdx.graphics.Color;

/**
 * Listener for {@link ColorPicker}
 * @author Kotcrab
 */
public interface ColorPickerListener {
	/** Called when color selection was canceled by user (either by clicking cancel or closing the window) */
	void canceled ();

	/** Called when user finises selecting new color */
	void finished (Color newColor);
}
