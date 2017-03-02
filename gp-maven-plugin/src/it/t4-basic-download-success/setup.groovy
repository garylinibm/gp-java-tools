/*  
 * Copyright IBM Corp. 2017
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

import java.io.*
import java.lang.reflect.*
import java.util.*
import java.util.regex.*

try {
    println "setup for basic download success test"
    com.ibm.g11n.pipeline.maven.ITTools.createCredentialsFile("target/it/t4-basic-download-success", "setup.properties")     
} catch( Throwable t ) {
    t.printStackTrace()
    return false
}
