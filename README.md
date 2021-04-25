# Homework 8

1. Follow instructions in [wiki](https://gitlab.fi.muni.cz/grp-pv256/wiki/wikis/home)
and proceed with forking this repo
2. Finish implementation of data classes `Character`, `CharacterList`, and `Location`
   * Make them compatible with Moshi's Adapter
   * Make sure your implementation works with their usage in `DetailActivity`
   * You don't have to implement the whole schema, not all attributes are used in the `DetailActivity`
3. Use Retrofit, to implement ApiService
   * Implement function to get all characters
   * Only the "results" list from https://rickandmortyapi.com/documentation/#get-all-characters is needed
4. Finish implementation of CharacterList fetching in `MainViewModel`
5. Submit changes into a **submit** branch and push it to your forked repo
6. Create a merge request against _your_ master branch and assign it to _qtokar_

Your commit must pass Gitlab CI verification. To test this locally, run:
```
./gradlew check
```

Note: Pipelines are not passing in the initial state.
