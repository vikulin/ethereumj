package org.ethereum.config.blockchain;

import org.ethereum.config.BlockchainConfig;

public class AquariumConfig extends ByzantiumConfig {

    public AquariumConfig(BlockchainConfig parent) {
        super(parent);
    }

    @Override
    public Integer getChainId() {
        return 11;
    }
}
