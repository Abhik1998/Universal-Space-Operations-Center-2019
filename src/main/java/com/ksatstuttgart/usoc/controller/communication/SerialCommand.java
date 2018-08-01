/*
 * MIT License
 *
 * Copyright (c) 2017 KSat e.V. and AerospaceResearch
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
package com.ksatstuttgart.usoc.controller.communication;

/**
 *
 * @author valentinstarlinger
 */
public enum SerialCommand {
    SendImage ("0"),
    ActivateSimulation ("1"),
    DeactivateSimulation ("2"),
    ActivateAscend ("3"),
    DeactivateAscend ("4"),
    PerformSelfTest ("5"),
    Reboot ("6"),
    Shutdown ("7"),
    EnableTestCommands ("8"),
    LightsOn ("9"),
    LightsOff ("10"),
    CamerasOn ("11"),
    CamerasOff ("12"),
    DriveForward ("13"),
    DriveBackward ("14"),
    StopDriving ("15"),
    AdhesionOn ("16"),
    AdhesionOff ("17");
    
    private String command;
    
    private SerialCommand (String command){
        this.command = command;
    }
    
    public String getCommand(){
        return command;
    }
}
