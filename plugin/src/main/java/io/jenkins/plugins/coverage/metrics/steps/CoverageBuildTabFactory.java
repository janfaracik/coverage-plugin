package io.jenkins.plugins.coverage.metrics.steps;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import hudson.model.Run;
import jenkins.model.Tab;
import jenkins.model.TransientActionFactory;

import java.util.Collection;
import java.util.Collections;

@Extension
public class CoverageBuildTabFactory extends TransientActionFactory<Run> {

    @Override
    public Class<Run> type() {
        return Run.class;
    }

    @NonNull
    @Override
    public Collection<? extends Tab> createFor(@NonNull Run target) {
        return Collections.singleton(new CoverageBuildTab(target));
    }
}
