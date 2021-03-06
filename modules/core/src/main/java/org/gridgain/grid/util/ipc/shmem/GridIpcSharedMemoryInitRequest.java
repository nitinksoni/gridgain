/* 
 Copyright (C) GridGain Systems. All Rights Reserved.
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.util.ipc.shmem;

import java.io.*;

/**
 *
 */
public class GridIpcSharedMemoryInitRequest implements Externalizable {
    /** */
    private static final long serialVersionUID = 0L;

    /** */
    private int pid;

    /**
     * @param pid PID of the {@code client} party.
     */
    public GridIpcSharedMemoryInitRequest(int pid) {
        this.pid = pid;
    }

    /**
     * Required by {@code Externalizable}.
     */
    public GridIpcSharedMemoryInitRequest() {
        // No-op.
    }

    /**
     * @return Sender PID.
     */
    public int pid() {
        return pid;
    }

    /** {@inheritDoc} */
    @Override public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(pid);
    }

    /** {@inheritDoc} */
    @Override public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        pid = in.readInt();
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "GridIpcSharedMemoryInitRequest [pid=" + pid + ']';
    }
}
