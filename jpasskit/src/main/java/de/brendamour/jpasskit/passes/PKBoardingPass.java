/**
 * Copyright (C) 2012 Patrice Brend'amour <p.brendamour@bitzeche.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.brendamour.jpasskit.passes;

import de.brendamour.jpasskit.PKTransitType;

public class PKBoardingPass extends PKGenericPass {
    private PKTransitType transitType;

    public PKTransitType getTransitType() {
        return transitType;
    }

    public void setTransitType(final PKTransitType transitType) {
        this.transitType = transitType;
    }

    public boolean isValid() {
        boolean valid = super.isValid();
        if (transitType == null) {
            valid = false;
        }
        return valid;
    }
}