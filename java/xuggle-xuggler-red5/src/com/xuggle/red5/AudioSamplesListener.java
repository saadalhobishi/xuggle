/*******************************************************************************
 * Copyright (c) 2008, 2010 Xuggle Inc.  All rights reserved.
 *  
 * This file is part of Xuggle-Xuggler-Red5.
 *
 * Xuggle-Xuggler-Red5 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Xuggle-Xuggler-Red5 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Xuggle-Xuggler-Red5.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

package com.xuggle.red5;

import com.xuggle.xuggler.IAudioSamples;

/**
 * A base listener class that implements all methods as pass-through methods.
 * 
 * This can be helpful if you don't want to override every single method on the listener.
 */
public class AudioSamplesListener implements IAudioSamplesListener
{

  public IAudioSamples postDecode(IAudioSamples aObject)
  {
    return aObject;
  }

  public IAudioSamples postResample(IAudioSamples aObject)
  {
    return aObject;
  }

  public IAudioSamples preEncode(IAudioSamples aObject)
  {
    return aObject;
  }

  public IAudioSamples preResample(IAudioSamples aObject)
  {
    return aObject;
  }
}
