'use strict';

app.config(['$translateProvider', function ($translateProvider) {
  // add translation table
  $translateProvider
    .preferredLanguage('en')
    .useSanitizeValueStrategy('sanitize')
    .useStaticFilesLoader({
        prefix: 'resources/Languages/locale-',
        suffix: '.json'
    });
}]);