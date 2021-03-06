/* Licensed under the Apache License, Version 2.0 (the "License");
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
package io.thesf.swiftframework.activiti.engine.impl.history.payloads;

import io.thesf.swiftframework.activiti.api.runtime.model.BPMNActivityChain;
import io.thesf.swiftframework.activiti.engine.impl.history.BPMNProcessActivityRecordPayload;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

/**
 * One kind of payload. - {@literal Roll Back}
 *
 * @author VirtualCry
 */
@Builder
@Getter @Setter
public class RollBackRecordPayload extends BPMNProcessActivityRecordPayload {

    protected boolean                           executeAfterCommit;
    protected String                            processInstanceId;
    protected Collection<BPMNActivityChain>     turnBackActivityChains;
    protected Collection<BPMNActivityChain>     recoveryActivityChains;
}
