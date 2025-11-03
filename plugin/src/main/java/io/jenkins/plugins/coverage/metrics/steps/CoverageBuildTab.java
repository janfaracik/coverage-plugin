package io.jenkins.plugins.coverage.metrics.steps;

import hudson.model.Actionable;
import jenkins.model.Tab;

public class CoverageBuildTab extends Tab {

    public CoverageBuildTab(Actionable object) {
        super(object);
    }

    @Override
    public String getIconFileName() {
        var coverageBuildAction = object.getAction(CoverageBuildAction.class);

        if (coverageBuildAction == null) {
            return null;
        }

        return coverageBuildAction.getIconFileName();
    }

    @Override
    public String getDisplayName() {
        return "Coverage";

    }

    @Override
    public String getUrlName() {
        return "coverage-report";
    }
}
