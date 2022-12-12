if [ "$CI_PLATFORM" != "web" ]; then
  npm run assets && npm run configure
fi

npm run build
