/*******************************************************************************
 * Copyright (C) 2015, Max Hohenegger <eclipse@hohenegger.eu>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.egit.gitflow.ui.internal.validation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.egit.gitflow.BranchNameValidator;
import org.eclipse.egit.gitflow.GitFlowRepository;

/**
 * Validate name of hotfix branch.
 */
public class HotfixNameValidator extends BranchNameInputValidator {
	private final GitFlowRepository repository;

	/**
	 * @param repository
	 */
	public HotfixNameValidator(GitFlowRepository repository) {
		this.repository = repository;
	}

	@Override
	protected boolean branchExists(String newText) throws CoreException {
		return BranchNameValidator.hotfixExists(repository, newText);
	}
}
