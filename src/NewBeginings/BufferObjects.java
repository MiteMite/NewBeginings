/*
 * Copyright (C) 2013 simon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package NewBeginings;

import java.nio.IntBuffer;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.BufferUtils.createIntBuffer;

public class BufferObjects {
    public void BufferObjectsHandle(){
        
        IntBuffer cubeVBO = createIntBuffer(1);
        glGenBuffers(cubeVBO);
        
    }

}
