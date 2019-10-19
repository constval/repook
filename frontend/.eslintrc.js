module.exports = {
  root: true,
  env: {
    commonjs: true,
    browser: true,
    node: true,
    es6: true,
  },
  parserOptions: {
    parser: "babel-eslint",
  },
  extends: ["@nuxtjs", "prettier", "prettier/vue", "plugin:prettier/recommended", "plugin:nuxt/recommended"],
  plugins: ["prettier"],
  // add your custom rules here
  rules: {
    "no-console": "off",
    "no-debugger": "off",
    "no-extra-semi": ["error"],
    semi: ["error", "never"],
  },
}
