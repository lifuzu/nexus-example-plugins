/*
 * Copyright (c) 2007-2012 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */

package org.sonatype.nexus.examples.selectionactors.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ???
 *
 * @since 1.0
 */
@XStreamAlias("runReport")
public class RunReportDTO
{
  private final String repositoryId;

  private final String selectorId;

  private final int selectedCount;

  private final String actorId;

  private final int actedCount;

  private final boolean success;

  public RunReportDTO(final String repositoryId, final String selectorId, final int selectedCount,
                      final String actorId, final int actedCount, final boolean success)
  {
    this.repositoryId = repositoryId;
    this.selectorId = selectorId;
    this.selectedCount = selectedCount;
    this.actorId = actorId;
    this.actedCount = actedCount;
    this.success = success;
  }

  protected String getRepositoryId() {
    return repositoryId;
  }

  protected String getSelectorId() {
    return selectorId;
  }

  protected int getSelectedCount() {
    return selectedCount;
  }

  protected String getActorId() {
    return actorId;
  }

  protected int getActedCount() {
    return actedCount;
  }

  protected boolean isSuccess() {
    return success;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "{" +
        "repositoryId='" + repositoryId + '\'' +
        ", selectorId='" + selectorId + '\'' +
        ", selectedCount=" + selectedCount +
        ", actorId='" + actorId + '\'' +
        ", actedCount=" + actedCount +
        ", success=" + success +
        '}';
  }
}
