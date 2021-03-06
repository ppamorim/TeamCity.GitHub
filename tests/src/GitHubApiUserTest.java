/*
 * Copyright 2000-2014 JetBrains s.r.o.
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

import jetbrains.teamcilty.github.api.GitHubApi;
import jetbrains.teamcilty.github.api.GitHubApiFactory;
import org.jetbrains.annotations.NotNull;

import java.util.Properties;

/**
 * @author Eugene Petrenko (eugene.petrenko@gmail.com)
 */
public class GitHubApiUserTest extends GitHubApiTestCase {
  @NotNull
  @Override
  protected GitHubApi createApi(@NotNull final Properties ps, @NotNull final GitHubApiFactory factory) {
    final String user = ps.getProperty(USERNAME);
    return factory.openGitHubForUser(ps.getProperty(URL),
            user, rewind(ps.getProperty(PASSWORD_REV))
    );
  }

}
