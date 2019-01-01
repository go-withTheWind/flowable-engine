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
package org.flowable.rest.service.api;

import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.form.api.FormInfo;
import org.flowable.task.api.Task;

public interface FormHandlerRestApiInterceptor {

    String convertStartFormInfo(FormInfo formInfo, ProcessDefinition processDefinition);
    
    String convertTaskFormInfo(FormInfo formInfo, Task task);
}