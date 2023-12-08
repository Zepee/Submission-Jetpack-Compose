package com.adhit.submissionjetpackcompose.model

import com.adhit.submissionjetpackcompose.R

object CoinData {
    val dummyCoin = listOf(
        Coin(
            id = 0,
            name = "Bitcoin",
            codeName = "BTC",
            founder = "Satoshi Nakamoto",
            dateRelease = "9 January 2009",
            ath = "68,789.63",
            image = R.drawable.btc,
            description = "Bitcoin is the first decentralized cryptocurrency. Nodes in the bitcoin network verify transactions through cryptography and record them in a public distributed ledger called a blockchain. Based on a free market ideology, bitcoin was invented in 2008 by Satoshi Nakamoto, an unknown person. Use of bitcoin as a currency began in 2009, with the release of its open-source implementation. In 2021, El Salvador adopted it as legal tender. Still, bitcoin is rarely used for transactions with merchants and is mostly seen as an investment. For this reason, it has been widely described as an economic bubble.",
            active = "Active"
        ),
        Coin(
            id = 1,
            name = "Ethereum",
            codeName = "ETH",
            founder = "Vitalik Buterin",
            dateRelease = "30 July 2015",
            ath = "$4,891.70.",
            image = R.drawable.eth,
            description = "Ethereum (ETH) is the cryptocurrency generated in accordance with the Ethereum protocol as a reward to validators in a proof-of-stake system for adding blocks to the blockchain. Ether (ETH) is the currency accepted by the Ethereum protocol as payment for the transaction fee. The transaction fee is composed of two parts: the base fee and the tip. The base fee is \"burned\" (deleted from existence) and the tip goes to the block proposer. The validator reward together with the tips provide the incentive to validators to keep the blockchain growing (i.e. to keep processing new transactions). Therefore, ETH is fundamental to the operation of the network.",
            active = "Active"
        ),
        Coin(
            id = 2,
            name = "Binance Coin",
            codeName = "BNB",
            founder = "Changpeng Zhao, and Yi He",
            dateRelease = "July 2017",
            ath = "$686.31",
            image = R.drawable.bnb,
            description = "BNB is the cryptocurrency that powers the Binance ecosystem. BNB can be used for discounts across the Binance ecosystem as well as staking, governance, and settling transactions on BNB Chain. The token can also be used for payments and DeFi services. BNB is regularly burned and removed from the token supply through quarterly burning events with BNB Auto-Burn. When BNB is used as gas for transactions on the BNB chain a portion of the BNB used as gas is burned.",
            active = "Active"
        ),
        Coin(
            id = 3,
            name = "Polygon",
            codeName = "MATIC",
            founder = "Jaynti Kanani, Sandeep Nailwal, Anurag Arjun, and Mihailo Bjelic",
            dateRelease = "1 June 2019",
            ath = "$2.92",
            image = R.drawable.matic,
            description = "Polygon (formerly Matic Network) is a blockchain platform which aims to create a multi-chain blockchain system compatible with Ethereum. As with Ethereum, it uses a proof-of-stake consensus mechanism for processing transactions on-chain. Polygon's native token is named MATIC. Matic is an ERC-20 token, allowing for compatibility with other Ethereum cryptocurrencies. Polygon is used in decentralized applications (dApps) such as Defi, DAOs, and NFTs. Polygon uses a modified proof of stake consensus mechanism that enables a consensus to be achieved with every block. Achieving consensus using traditional proof of stake requires processing many blocks to achieve consensus. The proof of stake method requires network participants to stake—agree to not trade or sell—their MATIC tokens, in exchange for the right to validate Polygon network transactions. Successful validators in the Polygon network are rewarded with MATIC tokens. The Polygon network aims to address problems within the Ethereum platform, namely high transaction fees and slow processing speeds. ",
            active = "Active"
        ),
        Coin(
            id = 4,
            name = "Ripple",
            codeName = "XRP",
            founder = "Arthur Britto, David Schwartz, and Ryan Fugger",
            dateRelease = " June 2012",
            ath = "$3.84",
            image = R.drawable.xrp,
            description = "Ripple is a real-time gross settlement system, currency exchange and remittance network that is open to financial institutions worldwide and was created by Ripple Labs Inc., a US-based technology company. Released in 2012, Ripple is built upon a distributed open source protocol, and supports tokens representing fiat currency, cryptocurrency, commodities, or other units of value such as frequent flier miles or mobile minutes.  Ripple purports to enable \"secure, instantly and nearly free global financial transactions of any size with no chargebacks. The ledger employs the native cryptocurrency known as XRP. In December 2020, Ripple Labs and two of its executives were sued by the U.S. Securities and Exchange Commission (SEC) for selling XRP tokens, which the SEC classified as unregistered securities. In July 2023, the court ruled that \"XRP, as a digital token, is not in and of itself a 'contract, transaction, or scheme' that embodies the Howey requirements of an investment contract.",
            active = "Active"
        ),
        Coin(
            id = 5,
            name = "Solana",
            codeName = "SOL",
            founder = "Anatoly Yakovenko",
            dateRelease = "February 2020",
            ath = " $260.06",
            image = R.drawable.solana,
            description = "Solana is a blockchain platform which uses a proof-of-stake mechanism to provide smart contract functionality. Its native cryptocurrency is SOL. Solana was launched in 2020 by Solana Labs, which was founded by Anatoly Yakovenko and Raj Gokal in 2018. The blockchain has experienced several major outages, was subjected to a hack, and a class action lawsuit was filed against the platform. Solana's total market cap was US\$55 billion in January 2022. However, by the end of 2022, this had fallen to around $3 billion following the bankruptcy of FTX. Following the general rise of the cryptocurrency market in 2023, its market cap rose to \$7 billion.",
            active = "Active"
        ),
        Coin(
            id = 6,
            name = "Uniswap",
            codeName = "UNI",
            founder = "Hayden Adams",
            dateRelease = "September 2020",
            ath = "$44.92",
            image = R.drawable.uni,
            description = "Uniswap is a decentralized cryptocurrency exchange that uses a set of smart contracts (liquidity pools) to execute trades. It is an open source project and falls into the category of a DeFi product (Decentralized finance) because it uses smart contracts to facilitate trades. The protocol facilitates automated transactions between cryptocurrency tokens on the Ethereum blockchain through the use of smart contracts. As of October 2020, Uniswap was estimated to be the largest decentralized exchange and the fourth-largest cryptocurrency exchange overall by daily trading volume. Uniswap is a decentralized finance protocol that is used to exchange cryptocurrencies and tokens; it is provided on blockchain networks that run open-source software. This is in contrast to cryptocurrency exchanges that are run by centralized companies. Changes to the protocol are voted on by the owners of a native cryptocurrency and governance token called UNI, and then implemented by a team of developers. UNI tokens were initially distributed to early users of the protocol. Each Ethereum address that had interacted with Uniswap before September 1, 2020 received the ability to claim 400 UNI tokens (worth approximately \$1,400 at the time). The market capitalization for the UNI token is over US\$6.6 billion as of February 2022.",
            active = "Active"
        ),
        Coin(
            id = 7,
            name = "Avalanche",
            codeName = "AVAX",
            founder = "Sekniqi and Maofan “Ted” Yin",
            dateRelease = "23 September 2020",
            ath = "$144.96",
            image = R.drawable.avax,
            description = "Avalanche began as a protocol for solving for consensus in a network of unreliable machines, where failures may be crash-fault or Byzantine. The protocol's fundamentals were first shared on the InterPlanetary File System (IPFS) in May 2018 by a pseudonymous group of enthusiasts going by the name \"Team Rocket\".",
            active = "Active"
        ),
        Coin(
            id = 8,
            name = "Chainlink",
            codeName = "LINK",
            founder = "Sergey Nazarov, Steve Ellis, and Dr. Ari Juels",
            dateRelease = "September 2017",
            ath = "$52.70",
            image = R.drawable.chainlink,
            description = "Chainlink is a decentralized blockchain oracle network built on Ethereum. The network is intended to be used to facilitate the transfer of tamper-proof data from off-chain sources to on-chain smart contracts. Its creators claim it can be used to verify whether the parameters of a smart contract are met in a manner independent from any of the contract's stakeholders by connecting the contract directly to real-world data, events, payments, and other inputs. Chainlink's decentralized oracle network is an open-source technology infrastructure that allows any blockchain to securely connect to off-chain data and computation resources. The network nodes fetch, validate, and deliver data from multiple sources onto blockchains to execute smart contracts.",
            active = "Active"
        ),
        Coin(
            id = 9,
            name = "Cardano",
            codeName = "ADA",
            founder = "Charles Hoskinson and Jeremy Wood",
            dateRelease = "27 September 2017",
            ath = "$3.0992",
            image = R.drawable.cardano,
            description = "Cardano is a public blockchain platform. It is open-source and decentralized, with consensus achieved using proof of stake. It can facilitate peer-to-peer transactions with its internal cryptocurrency, ADA. Cardano's development began in 2015, led by Ethereum co-founder Charles Hoskinson. The project is overseen and supervised by the Cardano Foundation based in Zug, Switzerland. When launched in 2017, it was the largest cryptocurrency to use a proof-of-stake blockchain, which is seen as a greener alternative to proof-of-work protocols. ",
            active = "Active"
        ),


        )
}