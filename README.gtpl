<h1 align="center">Hi 👋, Eimaan Afroz</h1>
<h3 align="center">Frontend Developer | Full-Stack Learner | React & React Native Explorer | Python Automation & AI Integration Enthusiast</h3>

<div align="center">
  <img src="https://developers.giphy.com/branch/master/static/api-512d36c09662682717108a38bbb5c57d.gif" alt="Developer Animation" height="270" />
</div>

---
<!-- <p align="center"><img src="https://raw.githubusercontent.com/Eim-31/Eim-31/main/eimaan-github.png" /></p> -->

### GitHub Stats

<p align="left"><img src="https://raw.githubusercontent.com/Eim-31/Eim-31/main/github-metrics.svg" /></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 📰 Recent Blog Posts
{{ range rss "https://eimaanafroz.online/index.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}
### 📫 How to reach me:
  - Twitter   : <https://twitter.com/eimaan_afroz>
  - Website   : <https://eimaanafroz.online>
