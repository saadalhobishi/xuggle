/*
 * This file is part of Xuggler.
 * 
 * Xuggler is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Xuggler is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public
 * License along with Xuggler.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.xuggle.utils.event;

/**
 * An interface that can have events dispatched to it.
 * 
 * <p>
 * 
 * The paradigm for dispatching events is:
 * 
 * </p>
 * 
 * <ol>
 * 
 *   <li> Find all appropriate handlers, and call them, stopping
 *      when a handler has successfully handled the event.</li>
 *   <li> If any handler throws an uncaught Exception, we will
 *      dispatch an {@link ErrorEvent} and continue with the
 *      next handler</li>
 *   <li> If the thread a dispatcher is running on is interrupted,
 *      we will return from the current dispatch loop.</li>
 *   <li>If a handler attempts to dispatch an event on the same
 *      dispatcher it is being run from, the new event is queued
 *      until the current handler returns</li>
 * 
 * </ol>
 * 
 * <p>
 *
 * Dispatchers must ensure that all listeners and handlers are
 * called on the same thread, but that thread need not be the same
 * thread that dispatchEvent() was called on (i.e. a IEventDispatcher
 * may fire up a separate thread for calling listeners and handlers; 
 * in fact, it almost always will).
 * 
 * </p>
 * 
 * @author aclarke
 *
 */
public interface IEventDispatcher extends IEventHandlerRegistrable {

  /**
   * Takes the given event, and passes
   * it to all appropriate handlers.
   * 
   * @param event The event to dispatch
   */
  void dispatchEvent(IEvent event);

}
