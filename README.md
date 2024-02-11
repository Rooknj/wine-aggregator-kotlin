# wine-aggregator-kotlin

[//]: # ([![Build]&#40;https://github.com/Rooknj/wine-aggregator/actions/workflows/Build.yml/badge.svg&#41;]&#40;https://github.com/Rooknj/wine-aggregator/actions/workflows/Build.yml&#41;)

[//]: # ([![codecov]&#40;https://codecov.io/github/Rooknj/wine-aggregator/graph/badge.svg?token=G9LSIQ0WLG&#41;]&#40;https://codecov.io/github/Rooknj/wine-aggregator&#41;)
[![Renovate enabled](https://img.shields.io/badge/renovate-enabled-brightgreen.svg)](https://renovatebot.com/)

## Development

### First: Set up [Lefthook](https://github.com/Arkweid/lefthook)

This project uses Lefthook to manage Git hooks. This will auto-format your code on commit
You can install it via Brew:

```sh
brew install Arkweid/lefthook/lefthook
```

After installation, initialize it via:

```sh
lefthook install
```

It is currently used for linting on pre-commit which you can run via:

```sh
lefthook run pre-commit
```